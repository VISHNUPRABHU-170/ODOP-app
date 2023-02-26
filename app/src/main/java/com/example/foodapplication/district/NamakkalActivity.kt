package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class NamakkalActivity : AppCompatActivity() {
    private lateinit var egg: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namakkal)
        init()

        egg.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.eggs)
            intent.putExtra("name","EGGS")
            startActivity(intent)
        }
    }
    private fun init(){
        egg=findViewById(R.id.image1)
    }
}