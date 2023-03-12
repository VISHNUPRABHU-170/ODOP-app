package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class RamanathapuramActivity : AppCompatActivity() {
    private lateinit var sweet: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramanathapuram)
        init()

        sweet.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.sweet)
            intent.putExtra("name","SWEETS")
            startActivity(intent)
        }
    }
    private fun init(){
        sweet=findViewById(R.id.image1)
    }
}