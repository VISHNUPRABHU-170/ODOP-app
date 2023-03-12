package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class TiruvarurActivity : AppCompatActivity() {
    private lateinit var coil: ImageView
    private lateinit var garlic: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiruvarur)
        init()

        coil.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.cocunut_oil)
            intent.putExtra("name","COCUNUT OIL")
            startActivity(intent)
        }
        garlic.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.garlic)
            intent.putExtra("name","GARLIC")
            startActivity(intent)
        }
    }
    private fun init(){
        coil=findViewById(R.id.image1)
        garlic=findViewById(R.id.image2)
    }
}