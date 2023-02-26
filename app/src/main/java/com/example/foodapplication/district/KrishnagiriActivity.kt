package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class KrishnagiriActivity : AppCompatActivity() {
    private lateinit var sweet: ImageView
    private lateinit var mango: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krishnagiri)
        init()

        sweet.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.images__3__removebg_preview)
            intent.putExtra("name","SWEETS")
            startActivity(intent)
        }
        mango.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.krishnagirimango)
            intent.putExtra("name","MANGO")
            startActivity(intent)
        }
    }

    private fun init(){
        sweet=findViewById(R.id.image1)
        mango=findViewById(R.id.image2)
    }
}