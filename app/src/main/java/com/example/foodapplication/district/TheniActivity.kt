package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class TheniActivity : AppCompatActivity() {
    private lateinit var crafts: ImageView
    private lateinit var snacks: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theni)
        init()

        crafts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.handicrafts)
            intent.putExtra("name","HANDI CRAFTS")
            startActivity(intent)
        }
        snacks.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.jeera_murukku)
            intent.putExtra("name","SNACKS")
            startActivity(intent)
        }
    }
    private fun init(){
        crafts=findViewById(R.id.image1)
        snacks=findViewById(R.id.image2)
    }
}