package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var profile: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profile=findViewById(R.id.profile)

        profile.setOnClickListener(){
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}