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
package code.name.score.octave.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.core.text.HtmlCompat
import code.name.score.appthemehelper.ThemeStore
import code.name.score.appthemehelper.util.VersionUtils
import code.name.score.octave.R
import code.name.score.octave.activities.base.AbsMusicServiceActivity
import code.name.score.octave.extensions.accentBackgroundColor
import code.name.score.octave.extensions.show
import code.name.score.octave.util.RingtoneManager
import kotlinx.android.synthetic.main.activity_permission.*
import kotlinx.android.synthetic.main.fragment_library.appNameText

class PermissionActivity : AbsMusicServiceActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_permission))
        setStatusbarColorAuto()
        setNavigationbarColorAuto()
        setLightNavigationBar(true)
        setTaskDescriptionColorAuto()
        setupTitle()

        storagePermission.setButtonClick {
            requestPermissions()
        }
        if (VersionUtils.hasMarshmallow()) audioPermission.show()
        audioPermission.setButtonClick {
            if (RingtoneManager.requiresDialog(this@PermissionActivity)) {
                val intent = Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS)
                intent.data = Uri.parse("package:" + applicationContext.packageName)
                startActivity(intent)
            }
        }
        finish.accentBackgroundColor()
        finish.setOnClickListener {
            if (hasPermissions()) {
                startActivity(
                    Intent(this, MainActivity::class.java).addFlags(
                        Intent.FLAG_ACTIVITY_NEW_TASK or
                                Intent.FLAG_ACTIVITY_CLEAR_TASK
                    )
                )
                finish()
            }
        }
    }

    private fun setupTitle() {
        val color = ThemeStore.accentColor(this)
        val hexColor = String.format("#%06X", 0xFFFFFF and color)
        val appName = HtmlCompat.fromHtml(
            "Hello there! <br>Welcome to <span style='color:$hexColor';>Octave</span>",
            HtmlCompat.FROM_HTML_MODE_COMPACT
        )
        appNameText.text = appName
    }
}
