package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class AriyalurActivity : AppCompatActivity() {
    private lateinit var cashew_nuts: ImageView
    private lateinit var indigo: ImageView
    private lateinit var kajukatli: ImageView
    private lateinit var car_parts: ImageView
    private lateinit var auto_componenets: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ariyalur)

        init()

        cashew_nuts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.cashew_nuts)
            intent.putExtra("name","CASHEW NUTS")
            startActivity(intent)
        }

        indigo.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.indigo_powder)
            intent.putExtra("name","INDIGO POWDER")
            startActivity(intent)
        }

        kajukatli.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.kaju_katli)
            intent.putExtra("name","KAJU KATLI")
            startActivity(intent)
        }

        car_parts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.car_parts)
            intent.putExtra("name","CAR PARTS")
            startActivity(intent)
        }

        auto_componenets.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.automative_components)
            intent.putExtra("name","AUTOMATIVE COMPONENTS")
            startActivity(intent)
        }
    }

    private fun init(){
        cashew_nuts=findViewById(R.id.image1)
        indigo=findViewById(R.id.image2)
        kajukatli=findViewById(R.id.image3)
        car_parts=findViewById(R.id.image4)
        auto_componenets=findViewById(R.id.image5)
    }
}