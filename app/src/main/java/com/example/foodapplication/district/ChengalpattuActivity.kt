package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class ChengalpattuActivity : AppCompatActivity() {
    private lateinit var nuts: ImageView
    private lateinit var kaju: ImageView
    private lateinit var indigo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chengalpattu)

        init()

        nuts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.cashew_nuts)
            intent.putExtra("name","CASHEW NUTS")
            startActivity(intent)
        }

        kaju.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.kaju_katli)
            intent.putExtra("name","KAJU KATLI")
            startActivity(intent)
        }

        indigo.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.indigo_powder)
            intent.putExtra("name","INDIGO POWDER")
            startActivity(intent)
        }
    }

    private fun init() {
        nuts = findViewById(R.id.image1)
        kaju = findViewById(R.id.image2)
        indigo = findViewById(R.id.image3)
    }
}