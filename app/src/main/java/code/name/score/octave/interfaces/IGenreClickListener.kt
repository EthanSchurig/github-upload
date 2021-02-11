package code.name.score.octave.interfaces

import android.view.View
import code.name.score.octave.model.Genre

interface IGenreClickListener {
    fun onClickGenre(genre: Genre, view: View)
}