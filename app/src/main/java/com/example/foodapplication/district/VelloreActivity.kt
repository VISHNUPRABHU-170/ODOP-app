package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class VelloreActivity : AppCompatActivity() {
    private lateinit var bag: ImageView
    private lateinit var lbag: ImageView
    private lateinit var belt: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vellore)
        init()

        bag.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.bags)
            intent.putExtra("name","SCHOOL BAGS")
            startActivity(intent)
        }
        lbag.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.luggage_bags)
            intent.putExtra("name","LUGGAGE BAGS")
            startActivity(intent)
        }
        belt.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.belt)
            intent.putExtra("name","LEATHER BELTS")
            startActivity(intent)
        }
    }
    private fun init(){
        bag=findViewById(R.id.image1)
        lbag=findViewById(R.id.image2)
        belt=findViewById(R.id.image3)
    }
}