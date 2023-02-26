package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class MaduraiActivity : AppCompatActivity() {
    private lateinit var sarees: ImageView
    private lateinit var fashion: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_madurai)
        init()

        sarees.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.fashion_sarees)
            intent.putExtra("name","SILK SAREE")
            startActivity(intent)
        }
        fashion.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.fashion)
            intent.putExtra("name","SILK SAREE")
            startActivity(intent)
        }
    }
    private fun init(){
        sarees=findViewById(R.id.image1)
        fashion=findViewById(R.id.image2)
    }
}