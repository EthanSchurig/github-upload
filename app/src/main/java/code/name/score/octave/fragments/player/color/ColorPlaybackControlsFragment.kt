/*
 * Copyright (c) 2021 Ethan Schurig.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package code.name.score.octave.fragments.player.color

import android.animation.ObjectAnimator
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.SeekBar
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import code.name.score.appthemehelper.util.ColorUtil
import code.name.score.appthemehelper.util.TintHelper
import code.name.score.octave.EXTRA_ALBUM_ID
import code.name.score.octave.EXTRA_ARTIST_ID
import code.name.score.octave.R
import code.name.score.octave.activities.MainActivity
import code.name.score.octave.extensions.applyColor
import code.name.score.octave.extensions.hide
import code.name.score.octave.extensions.show
import code.name.score.octave.fragments.base.AbsPlayerControlsFragment
import code.name.score.octave.helper.MusicPlayerRemote
import code.name.score.octave.helper.MusicProgressViewUpdateHelper
import code.name.score.octave.helper.PlayPauseButtonOnClickHandler
import code.name.score.octave.misc.SimpleOnSeekbarChangeListener
import code.name.score.octave.service.MusicService
import code.name.score.octave.util.MusicUtil
import code.name.score.octave.util.PreferenceUtil
import code.name.score.octave.util.color.MediaNotificationProcessor
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.*
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.nextButton
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.playPauseButton
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.previousButton
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.progressSlider
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.repeatButton
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.shuffleButton
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.songCurrentProgress
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.songInfo
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.songTotalTime
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.text
import kotlinx.android.synthetic.main.fragment_color_player_playback_controls.title

class ColorPlaybackControlsFragment :
    AbsPlayerControlsFragment(R.layout.fragment_color_player_playback_controls) {

    private var lastPlaybackControlsColor: Int = 0
    private var lastDisabledPlaybackControlsColor: Int = 0
    private lateinit var progressViewUpdateHelper: MusicProgressViewUpdateHelper

    val mainActivity: MainActivity
        get() = activity as MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressViewUpdateHelper = MusicProgressViewUpdateHelper(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_color_player_playback_controls, container, false)
    }

    override fun onResume() {
        super.onResume()
        progressViewUpdateHelper.start()
    }

    override fun onPause() {
        super.onPause()
        progressViewUpdateHelper.stop()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpMusicControllers()
        title.isSelected = true
        titleButton.setOnClickListener {
            val song = MusicPlayerRemote.currentSong
            mainActivity.collapsePanel()
            requireActivity().findNavController(R.id.fragment_container).navigate(
                    R.id.albumDetailsFragment,
                    bundleOf(EXTRA_ALBUM_ID to song.albumId)
            )
        }
        text.isSelected = true
        textButton.setOnClickListener {
            val song = MusicPlayerRemote.currentSong
            mainActivity.collapsePanel()
            requireActivity().findNavController(R.id.fragment_container).navigate(
                    R.id.artistDetailsFragment,
                    bundleOf(EXTRA_ARTIST_ID to song.artistId)
            )
        }
    }

    private fun updateSong() {
        val song = MusicPlayerRemote.currentSong
        title.text = song.title
        text.text = song.artistName

        if (PreferenceUtil.isSongInfo) {
            songInfo.text = getSongInfo(song)
            songInfo.show()
        } else {
            songInfo.hide()
        }
    }

    override fun onServiceConnected() {
        updatePlayPauseDrawableState()
        updateRepeatState()
        updateShuffleState()
        updateSong()
    }

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateSong()
    }

    override fun onPlayStateChanged() {
        updatePlayPauseDrawableState()
    }

    override fun onRepeatModeChanged() {
        updateRepeatState()
    }

    override fun onShuffleModeChanged() {
        updateShuffleState()
    }

    override fun setColor(color: MediaNotificationProcessor) {
        TintHelper.setTintAuto(playPauseButton, color.primaryTextColor, true)
        TintHelper.setTintAuto(playPauseButton, color.backgroundColor, false)
        progressSlider.applyColor(color.primaryTextColor)

        title.setTextColor(color.primaryTextColor)
        text.setTextColor(color.secondaryTextColor)
        songInfo.setTextColor(color.secondaryTextColor)
        songCurrentProgress.setTextColor(color.secondaryTextColor)
        songTotalTime.setTextColor(color.secondaryTextColor)
        volumeFragment?.setTintableColor(color.primaryTextColor)

        lastPlaybackControlsColor = color.secondaryTextColor
        lastDisabledPlaybackControlsColor = ColorUtil.withAlpha(color.secondaryTextColor, 0.25f)

        updateRepeatState()
        updateShuffleState()
        updatePrevNextColor()
        updatePlayPause()
    }

    private fun updatePlayPause() {
        playPauseButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
    }

    private fun setUpPlayPauseFab() {
        TintHelper.setTintAuto(playPauseButton, Color.WHITE, true)
        TintHelper.setTintAuto(playPauseButton, Color.BLACK, false)
        playPauseButton.setOnClickListener(PlayPauseButtonOnClickHandler())
    }

    private fun updatePlayPauseDrawableState() {
        when {
            MusicPlayerRemote.isPlaying -> playPauseButton.setImageResource(R.drawable.ic_pause)
            else -> playPauseButton.setImageResource(R.drawable.ic_play_arrow)
        }
    }

    private fun setUpMusicControllers() {
        setUpPlayPauseFab()
        setUpPrevNext()
        setUpRepeatButton()
        setUpShuffleButton()
        setUpProgressSlider()
    }

    private fun setUpPrevNext() {
        updatePrevNextColor()
        nextButton.setOnClickListener { MusicPlayerRemote.playNextSong() }
        previousButton.setOnClickListener { MusicPlayerRemote.back() }
    }

    private fun updatePrevNextColor() {
        nextButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
        previousButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
    }

    private fun setUpShuffleButton() {
        shuffleButton.setOnClickListener { MusicPlayerRemote.toggleShuffleMode() }
    }

    override fun updateShuffleState() {
        when (MusicPlayerRemote.shuffleMode) {
            MusicService.SHUFFLE_MODE_SHUFFLE -> shuffleButton.setColorFilter(
                lastPlaybackControlsColor,
                PorterDuff.Mode.SRC_IN
            )
            else -> shuffleButton.setColorFilter(
                lastDisabledPlaybackControlsColor,
                PorterDuff.Mode.SRC_IN
            )
        }
    }

    private fun setUpRepeatButton() {
        repeatButton.setOnClickListener { MusicPlayerRemote.cycleRepeatMode() }
    }

    override fun updateRepeatState() {
        when (MusicPlayerRemote.repeatMode) {
            MusicService.REPEAT_MODE_NONE -> {
                repeatButton.setImageResource(R.drawable.ic_repeat)
                repeatButton.setColorFilter(
                    lastDisabledPlaybackControlsColor,
                    PorterDuff.Mode.SRC_IN
                )
            }
            MusicService.REPEAT_MODE_ALL -> {
                repeatButton.setImageResource(R.drawable.ic_repeat)
                repeatButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
            }
            MusicService.REPEAT_MODE_THIS -> {
                repeatButton.setImageResource(R.drawable.ic_repeat_one)
                repeatButton.setColorFilter(lastPlaybackControlsColor, PorterDuff.Mode.SRC_IN)
            }
        }
    }

    public override fun show() {
        playPauseButton!!.animate()
            .scaleX(1f)
            .scaleY(1f)
            .rotation(360f)
            .setInterpolator(DecelerateInterpolator())
            .start()
    }

    public override fun hide() {
        playPauseButton.apply {
            scaleX = 0f
            scaleY = 0f
            rotation = 0f
        }
    }

    override fun setUpProgressSlider() {
        progressSlider.setOnSeekBarChangeListener(object : SimpleOnSeekbarChangeListener() {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    MusicPlayerRemote.seekTo(progress)
                    onUpdateProgressViews(
                        MusicPlayerRemote.songProgressMillis,
                        MusicPlayerRemote.songDurationMillis
                    )
                }
            }
        })
    }

    override fun onUpdateProgressViews(progress: Int, total: Int) {
        progressSlider.max = total

        val animator = ObjectAnimator.ofInt(progressSlider, "progress", progress)
        animator.duration = SLIDER_ANIMATION_TIME
        animator.interpolator = LinearInterpolator()
        animator.start()

        songTotalTime.text = MusicUtil.getReadableDurationString(total.toLong())
        songCurrentProgress.text = MusicUtil.getReadableDurationString(progress.toLong())
    }
}
