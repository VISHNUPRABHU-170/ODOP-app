package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class NagappattinamActivity : AppCompatActivity() {
    private lateinit var fish: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nagappattinam)
        init()

        fish.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.dried_fish)
            intent.putExtra("name","DRY FISH")
            startActivity(intent)
        }
    }
    private fun init(){
        fish=findViewById(R.id.image1)
    }
}