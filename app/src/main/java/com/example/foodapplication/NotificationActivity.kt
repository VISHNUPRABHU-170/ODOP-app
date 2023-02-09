package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        supportActionBar?.hide()

        val str = intent.getStringExtra("message_name")

        val in_home =findViewById(R.id.homeicon) as ImageView
        in_home.setOnClickListener(){
            intent.putExtra("message_name", str)
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        val in_profile=findViewById(R.id.profile) as ImageView
        in_profile.setOnClickListener(){
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
        val in_cart=findViewById(R.id.carticon) as ImageView
        in_cart.setOnClickListener(){
            intent.putExtra("message_add",str)
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
    }
}