package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class NilgirisActivity : AppCompatActivity() {
    private lateinit var teapowder: ImageView
    private lateinit var greentea: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilgiris)
        init()

        teapowder.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tea_powder)
            intent.putExtra("name","TEA POWDER")
            startActivity(intent)
        }
        greentea.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.green_tea)
            intent.putExtra("name","GREEN TEA")
            startActivity(intent)
        }
    }
    private fun init(){
        teapowder=findViewById(R.id.image1)
        greentea=findViewById(R.id.image2)
    }
}