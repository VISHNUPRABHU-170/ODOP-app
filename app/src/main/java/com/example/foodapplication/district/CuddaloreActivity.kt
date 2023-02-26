package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class CuddaloreActivity : AppCompatActivity() {
    private lateinit var cashew: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuddalore)
        init()

        cashew.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.cashew_products)
            intent.putExtra("name","CASHEW PRODUCTS")
            startActivity(intent)
        }
    }

    private fun init(){
        cashew=findViewById(R.id.image1)
    }
}