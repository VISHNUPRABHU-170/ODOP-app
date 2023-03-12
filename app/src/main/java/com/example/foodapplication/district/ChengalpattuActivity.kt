package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class ChengalpattuActivity : AppCompatActivity() {
    private lateinit var auto_parts: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chengalpattu)

        init()

        auto_parts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.auto_parts)
            intent.putExtra("name","AUTOM PARTS")
            startActivity(intent)
        }

    }

    private fun init() {
        auto_parts = findViewById(R.id.image1)
    }
}