package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val in_profile=findViewById(R.id.profile) as ImageView
        val intent = intent
        val str = intent.getStringExtra("message_name")
        val num= intent.getStringExtra("message_num")
        in_profile.setOnClickListener(){
            val intent = Intent(this,ProfileActivity::class.java)
            intent.putExtra("message_name", str)
            intent.putExtra("message_num",num)
            startActivity(intent)
        }
    }
}