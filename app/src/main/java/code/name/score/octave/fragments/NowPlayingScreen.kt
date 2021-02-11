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
package code.name.score.octave.fragments

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import code.name.score.octave.R

enum class NowPlayingScreen constructor(
    @param:StringRes @field:StringRes
    val titleRes: Int,
    @param:DrawableRes @field:DrawableRes val drawableResId: Int,
    val id: Int
) {
    Blur(R.string.blur, R.drawable.np_blur, 4),
    Circle(R.string.circle, R.drawable.np_minimalistic_circle, 15),
    Color(R.string.color, R.drawable.np_color, 5),
    Normal(R.string.normal, R.drawable.np_normal, 0),
}
