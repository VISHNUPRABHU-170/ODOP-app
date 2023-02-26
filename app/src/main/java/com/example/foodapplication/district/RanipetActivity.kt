package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class RanipetActivity : AppCompatActivity() {
    private lateinit var purse: ImageView
    private lateinit var shoe: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranipet)
        init()

        purse.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.leather_purse)
            intent.putExtra("name","LEATHER PURSE")
            startActivity(intent)
        }
        shoe.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.leather_shoes)
            intent.putExtra("name","LEATHER SHOES")
            startActivity(intent)
        }
    }
    private fun init(){
        purse=findViewById(R.id.image1)
        shoe=findViewById(R.id.image2)
    }
}