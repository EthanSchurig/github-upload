package code.name.score.octave.interfaces

import android.view.View
import code.name.score.octave.db.PlaylistWithSongs

interface IPlaylistClickListener {
    fun onPlaylistClick(playlistWithSongs: PlaylistWithSongs, view: View)
}