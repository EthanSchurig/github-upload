package code.name.score.octave.model.smartplaylist

import androidx.annotation.DrawableRes
import code.name.score.octave.R
import code.name.score.octave.model.AbsCustomPlaylist

abstract class AbsSmartPlaylist(
    name: String,
    @DrawableRes val iconRes: Int = R.drawable.ic_queue_music
) : AbsCustomPlaylist(
    id = PlaylistIdGenerator(name, iconRes),
    name = name
)