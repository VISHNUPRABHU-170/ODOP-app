package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class DharmapuriActivity : AppCompatActivity() {
    private lateinit var shirt: ImageView
    private lateinit var pant: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dharmapuri)
        init()

        shirt.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.shirts)
            intent.putExtra("name","SHIRT")
            startActivity(intent)
        }

        pant.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.pants)
            intent.putExtra("name","PANT")
            startActivity(intent)
        }
    }

    private fun init(){
        shirt=findViewById(R.id.image1)
        pant=findViewById(R.id.image2)
    }
}