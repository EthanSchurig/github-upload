/*
 * Copyright (c) 2021 Ethan Schurig.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.score.octave.preferences

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat.SRC_IN
import androidx.fragment.app.DialogFragment
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import code.name.score.appthemehelper.common.prefs.supportv7.ATEDialogPreference
import code.name.score.octave.App
import code.name.score.octave.R
import code.name.score.octave.extensions.*
import code.name.score.octave.fragments.AlbumCoverStyle
import code.name.score.octave.fragments.AlbumCoverStyle.*
import code.name.score.octave.util.NavigationUtil
import code.name.score.octave.util.PreferenceUtil
import code.name.score.octave.util.ViewUtil
import com.bumptech.glide.Glide

class AlbumCoverStylePreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = -1,
    defStyleRes: Int = -1
) : ATEDialogPreference(context, attrs, defStyleAttr, defStyleRes) {

    private val mLayoutRes = R.layout.preference_dialog_now_playing_screen

    override fun getDialogLayoutResource(): Int {
        return mLayoutRes
    }

    init {
        icon?.colorFilter =
            BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                context.colorControlNormal(),
                SRC_IN
            )
    }
}

class AlbumCoverStylePreferenceDialog : DialogFragment(),
    ViewPager.OnPageChangeListener {

    private var viewPagerPosition: Int = 0

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        @SuppressLint("InflateParams") val view =
            LayoutInflater.from(requireContext())
                .inflate(R.layout.preference_dialog_now_playing_screen, null)
        val viewPager = view.findViewById<ViewPager>(R.id.now_playing_screen_view_pager)
        viewPager.adapter = AlbumCoverStyleAdapter(requireContext())
        viewPager.addOnPageChangeListener(this)
        viewPager.pageMargin = ViewUtil.convertDpToPixel(32f, resources).toInt()
        viewPager.currentItem = PreferenceUtil.albumCoverStyle.ordinal

        return materialDialog(R.string.pref_title_album_cover_style)
            .setPositiveButton(R.string.set) { _, _ ->
                val coverStyle = values()[viewPagerPosition]
                    PreferenceUtil.albumCoverStyle = coverStyle
            }
            .setView(view)
            .create()
            .colorButtons()
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        this.viewPagerPosition = position
    }

    override fun onPageScrollStateChanged(state: Int) {
    }

    private class AlbumCoverStyleAdapter(private val context: Context) :
        PagerAdapter() {

        override fun instantiateItem(collection: ViewGroup, position: Int): Any {
            val albumCoverStyle = values()[position]

            val inflater = LayoutInflater.from(context)
            val layout = inflater.inflate(
                R.layout.preference_now_playing_screen_item,
                collection,
                false
            ) as ViewGroup
            collection.addView(layout)

            val image = layout.findViewById<ImageView>(R.id.image)
            val title = layout.findViewById<TextView>(R.id.title)
            Glide.with(context).load(albumCoverStyle.drawableResId).into(image)
            title.setText(albumCoverStyle.titleRes)
            return layout
        }

        override fun destroyItem(
            collection: ViewGroup,
            position: Int,
            view: Any
        ) {
            collection.removeView(view as View)
        }

        override fun getCount(): Int {
            return values().size
        }

        override fun isViewFromObject(view: View, instace: Any): Boolean {
            return view === instace
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return context.getString(values()[position].titleRes)
        }
    }

    companion object {
        val TAG: String = AlbumCoverStylePreferenceDialog::class.java.simpleName

        fun newInstance(): AlbumCoverStylePreferenceDialog {
            return AlbumCoverStylePreferenceDialog()
        }
    }
}

private fun isAlbumCoverStyle(style: AlbumCoverStyle): Boolean {
    return (style == Normal)
}