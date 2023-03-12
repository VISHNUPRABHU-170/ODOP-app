package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class VillupuramActivity : AppCompatActivity() {
    private lateinit var orice: ImageView
    private lateinit var rice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_villupuram)
        init()

        orice.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.orgainc_rices)
            intent.putExtra("name","ORGANIC RICE")
            startActivity(intent)
        }
        rice.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.rices)
            intent.putExtra("name","RICE")
            startActivity(intent)
        }
    }
    private fun init(){
        orice=findViewById(R.id.image1)
        rice=findViewById(R.id.image2)
    }
}