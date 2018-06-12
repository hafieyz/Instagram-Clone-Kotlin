package com.alexbezhan.instagram.activities.profile.settings

import android.os.Bundle
import com.alexbezhan.instagram.R
import com.alexbezhan.instagram.activities.BaseActivity
import com.alexbezhan.instagram.utils.FirebaseHelper
import kotlinx.android.synthetic.main.activity_profile_settings.*

class ProfileSettingsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)

        sign_out_text.setOnClickListener { FirebaseHelper.auth.signOut() }
        back_image.setOnClickListener { finish() }
    }
}