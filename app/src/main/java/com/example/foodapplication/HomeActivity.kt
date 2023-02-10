package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var profile: ImageView
    private lateinit var notification: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profile=findViewById(R.id.profile)

        profile.setOnClickListener(){
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        notification=findViewById(R.id.notification)

        notification.setOnClickListener(){
            val intent=Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        }

        cart=findViewById(R.id.cart)

        cart.setOnClickListener(){
            val intent=Intent(this,CartActivity::class.java)
            startActivity(intent)
        }

        home=findViewById(R.id.home)

        home.setOnClickListener(){
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}