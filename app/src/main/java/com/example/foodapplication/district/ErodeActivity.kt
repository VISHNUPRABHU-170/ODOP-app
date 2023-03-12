package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class ErodeActivity : AppCompatActivity() {
    private lateinit var turmericpowder: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_erode)
        init()

        turmericpowder.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.turmeric_powder)
            intent.putExtra("name","TURMERIC POWDER")
            startActivity(intent)
        }
    }

    private fun init(){
        turmericpowder=findViewById(R.id.image1)
    }
}