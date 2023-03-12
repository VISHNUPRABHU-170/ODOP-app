package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class TrichyActivity : AppCompatActivity() {
    private lateinit var snacks: ImageView
    private lateinit var sweet: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trichy)
        init()

        snacks.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.snacks)
            intent.putExtra("name","SNACKS")
            startActivity(intent)
        }
        sweet.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.sweets)
            intent.putExtra("name","SWEETS")
            startActivity(intent)
        }
    }
    private fun init(){
        snacks=findViewById(R.id.image1)
        sweet=findViewById(R.id.image2)
    }
}