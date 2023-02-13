package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CartActivity : AppCompatActivity() {
    private lateinit var profile: ImageView
    private lateinit var notification: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var gohome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        supportActionBar?.hide()

        init()

        profile.setOnClickListener(){
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        notification.setOnClickListener(){
            val intent=Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        }

        cart.setOnClickListener(){
            val intent=Intent(this,CartActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener(){
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        gohome.setOnClickListener(){
            startActivity(Intent(this,HomeActivity::class.java))
        }

    }

    private fun init() {
        profile = findViewById(R.id.profile)
        notification = findViewById(R.id.notification)
        cart = findViewById(R.id.cart)
        home = findViewById(R.id.home)
        gohome=findViewById(R.id.gohome)
    }
}