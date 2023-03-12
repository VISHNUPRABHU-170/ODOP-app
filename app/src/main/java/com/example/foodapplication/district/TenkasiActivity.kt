package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class TenkasiActivity : AppCompatActivity() {
    private lateinit var coir: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenkasi)
        init()

        coir.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.coir_pith_blocks)
            intent.putExtra("name","COIR BLOCKS")
            startActivity(intent)
        }
    }
    private fun init(){
        coir=findViewById(R.id.image1)
    }
}