package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class CoimbatoreActivity : AppCompatActivity() {
    private lateinit var saree: ImageView
    private lateinit var palm: ImageView
    private lateinit var motor: ImageView
    private lateinit var carparts: ImageView
    private lateinit var automative: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coimbatore)
        init()

        saree.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.silk_sarees)
            intent.putExtra("name","SILK SAREE")
            startActivity(intent)
        }

        palm.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.palm)
            intent.putExtra("name","PALM")
            startActivity(intent)
        }

        motor.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.motor)
            intent.putExtra("name","MOTOR")
            startActivity(intent)
        }

        carparts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.car_parts)
            intent.putExtra("name","CAR PARTS")
            startActivity(intent)
        }

        automative.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.automative_components)
            intent.putExtra("name","AUTOMATIVE COMPONENTS")
            startActivity(intent)
        }
    }

    private fun init(){
        saree=findViewById(R.id.image1)
        palm=findViewById(R.id.image2)
        motor=findViewById(R.id.image3)
        carparts=findViewById(R.id.image4)
        automative=findViewById(R.id.image5)
    }
}