package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val in_profile=findViewById(R.id.profile) as ImageView
        val intent = intent
        val str = intent.getStringExtra("message_name")
        val num= intent.getStringExtra("message_num")
        val add=intent.getStringExtra("message_add")
        val show=findViewById<TextView>(R.id.address)
        show.text=add
        in_profile.setOnClickListener(){
            val intent = Intent(this,ProfileActivity::class.java)
            intent.putExtra("message_name", str)
            intent.putExtra("message_num",num)
            intent.putExtra("message_add",add)
            startActivity(intent)
        }
        val in_cart=findViewById(R.id.carticon) as ImageView
        in_cart.setOnClickListener(){
            intent.putExtra("message_add",add)
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
        val in_notification=findViewById(R.id.notificationicon) as ImageView
        in_notification.setOnClickListener(){
            intent.putExtra("message_add",add)
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
    }
}