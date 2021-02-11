package code.name.score.octave.interfaces

import code.name.score.octave.model.Album
import code.name.score.octave.model.Artist
import code.name.score.octave.model.Genre

interface IHomeClickListener {
    fun onAlbumClick(album: Album)

    fun onArtistClick(artist: Artist)

    fun onGenreClick(genre: Genre)
}