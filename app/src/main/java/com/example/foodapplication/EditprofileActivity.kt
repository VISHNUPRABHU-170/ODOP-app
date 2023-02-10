package com.example.foodapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditprofileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)
    }
}