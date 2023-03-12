package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class ChennaiActivity : AppCompatActivity() {
    private lateinit var automobile: ImageView
    private lateinit var organicfoods: ImageView
    private lateinit var medicalequip: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chennai)
        init()

        automobile.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.automobile_accessiors)
            intent.putExtra("name","AUTOMOBILE ACCESSORIES")
            startActivity(intent)
        }

        medicalequip.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.medical_equipments)
            intent.putExtra("name","MEDICAL EQUIPMENTS")
            startActivity(intent)
        }

        organicfoods.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.organic_foods)
            intent.putExtra("name","ORGANIC FOODS")
            startActivity(intent)
        }

    }

    private fun init(){
        automobile=findViewById(R.id.image2)
        organicfoods=findViewById(R.id.image4)
        medicalequip=findViewById(R.id.image5)
    }
}