package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class KanyakumariActivity : AppCompatActivity() {
    private lateinit var fruits: ImageView
    private lateinit var snacks: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanyakumari)
        init()

        fruits.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.fruits)
            intent.putExtra("name","FRUITS")
            startActivity(intent)
        }

        snacks.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.ships)
            intent.putExtra("name","SNACKS")
            startActivity(intent)
        }
    }
    private fun init(){
        fruits=findViewById(R.id.image1)
        snacks=findViewById(R.id.image2)
    }
}