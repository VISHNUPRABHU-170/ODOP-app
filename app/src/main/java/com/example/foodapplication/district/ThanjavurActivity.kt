package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class ThanjavurActivity : AppCompatActivity() {
    private lateinit var cocunut: ImageView
    private lateinit var paint: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanjavur)
        init()

        cocunut.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.fresh_coconut)
            intent.putExtra("name","FRESH COCUNUTS")
            startActivity(intent)
        }
        paint.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tanjore_painting)
            intent.putExtra("name","THANJAVUR PAINTS")
            startActivity(intent)
        }
    }
    private fun init(){
        paint=findViewById(R.id.image1)
        cocunut=findViewById(R.id.image2)
    }
}