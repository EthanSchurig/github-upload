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
package code.name.score.octave.glide

import android.graphics.drawable.Drawable
import android.widget.ImageView
import code.name.score.appthemehelper.util.ATHUtil
import code.name.score.octave.App
import code.name.score.octave.R
import code.name.score.octave.glide.palette.BitmapPaletteTarget
import code.name.score.octave.glide.palette.BitmapPaletteWrapper
import code.name.score.octave.util.color.MediaNotificationProcessor
import com.bumptech.glide.request.animation.GlideAnimation

abstract class octaveColoredTarget(view: ImageView) : BitmapPaletteTarget(view) {

    protected val defaultFooterColor: Int
        get() = ATHUtil.resolveColor(getView().context, R.attr.colorControlNormal)

    abstract fun onColorReady(colors: MediaNotificationProcessor)

    override fun onLoadFailed(e: Exception?, errorDrawable: Drawable?) {
        super.onLoadFailed(e, errorDrawable)
        val colors = MediaNotificationProcessor(App.getContext(), errorDrawable)
        onColorReady(colors)
    }

    override fun onResourceReady(
        resource: BitmapPaletteWrapper?,
        glideAnimation: GlideAnimation<in BitmapPaletteWrapper>?
    ) {
        super.onResourceReady(resource, glideAnimation)
        resource?.let { bitmapWrap ->
            MediaNotificationProcessor(App.getContext()).getPaletteAsync({
                onColorReady(it)
            }, bitmapWrap.bitmap)
        }
    }
}
