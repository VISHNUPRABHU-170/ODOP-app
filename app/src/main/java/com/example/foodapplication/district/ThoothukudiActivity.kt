package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class ThoothukudiActivity : AppCompatActivity() {
    private lateinit var sweet: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thoothukudi)
        init()

        sweet.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tuticotrin_macroon1_removebg_preview)
            intent.putExtra("name","SWEETS")
            startActivity(intent)
        }
    }
    private fun init(){
        sweet=findViewById(R.id.image1)
    }
}