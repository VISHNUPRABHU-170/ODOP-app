package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class KarurActivity : AppCompatActivity() {
    private lateinit var handlooms: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karur)
        init()

        handlooms.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.handloom_products)
            intent.putExtra("name","HANDLOOM PRODUCTS")
            startActivity(intent)
        }
    }
    private fun init(){
        handlooms=findViewById(R.id.image1)
    }

}