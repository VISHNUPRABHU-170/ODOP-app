package com.example.foodapplication

import android.R.attr.phoneNumber
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase


class HomeActivity : AppCompatActivity() {

    private lateinit var profile: ImageView
    private lateinit var notification: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var location: TextView
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
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


    }


    private fun init(){
        profile=findViewById(R.id.profile)
        notification=findViewById(R.id.notification)
        cart=findViewById(R.id.cart)
        home=findViewById(R.id.home)
        location=findViewById(R.id.address)
        auth= FirebaseAuth.getInstance()
    }
}