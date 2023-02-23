package com.example.foodapplication.cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import com.example.foodapplication.HomeActivity
import com.example.foodapplication.district.DistrictActivity
import com.example.foodapplication.R
import com.example.foodapplication.profile.ProfileActivity
import com.example.foodapplication.search.SearchActivity

class CartActivity : AppCompatActivity() {
    private lateinit var profile: ImageView
    private lateinit var district: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var gohome: Button
    private lateinit var search: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
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

        gohome.setOnClickListener(){
            startActivity(Intent(this, HomeActivity::class.java))
        }

        search.setOnClickListener(){
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

    }

    private fun init() {
        profile = findViewById(R.id.profile)
        district = findViewById(R.id.district)
        cart = findViewById(R.id.cart)
        home = findViewById(R.id.home)
        gohome=findViewById(R.id.gohome)
        search=findViewById(R.id.searchicon)
    }
}