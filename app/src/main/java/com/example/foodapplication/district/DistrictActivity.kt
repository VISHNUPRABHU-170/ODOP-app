package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.foodapplication.HomeActivity
import com.example.foodapplication.R
import com.example.foodapplication.cart.CartActivity
import com.example.foodapplication.profile.ProfileActivity

class DistrictActivity : AppCompatActivity() {
    private lateinit var profile: ImageView
    private lateinit var district: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var gohome: Button
    private lateinit var image: ImageView
    private lateinit var t1: TextView
    private lateinit var t2: TextView
    private lateinit var display: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_district)
        supportActionBar?.hide()

        init()

        profile.setOnClickListener(){
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        district.setOnClickListener(){
            val intent=Intent(this, DistrictActivity::class.java)
            startActivity(intent)
        }

        cart.setOnClickListener(){
            val intent=Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener(){
            val intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }



        val str=intent.getStringExtra("message")
        if(str.toString().equals("Your Order has Successfully Completed")){
            image.visibility= View.INVISIBLE
            t1.visibility=View.INVISIBLE
            t2.visibility=View.INVISIBLE

        }

    }

    private fun init() {
        profile = findViewById(R.id.profile)
        district = findViewById(R.id.district)
        cart = findViewById(R.id.cart)
        home = findViewById(R.id.home)

    }
}