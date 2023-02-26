package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class ThiruvallurActivity : AppCompatActivity() {
    private lateinit var parts: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thiruvallur)
        init()

        parts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.auto_components)
            intent.putExtra("name","AUTOMOBILE COMPONENTS")
            startActivity(intent)
        }
    }
    private fun init(){
        parts=findViewById(R.id.image1)
    }
}