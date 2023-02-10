package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    private lateinit var edit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        edit=findViewById(R.id.Edit)

        edit.setOnClickListener(){
            val intent =Intent(this,EditprofileActivity::class.java)
            startActivity(intent)
        }
    }
}