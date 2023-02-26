package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class TiruvannamalaiActivity : AppCompatActivity() {
    private lateinit var eoil: ImageView
    private lateinit var goil: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiruvannamalai)
        init()

        eoil.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.edibleoil)
            intent.putExtra("name","EDIBLE OIL")
            startActivity(intent)
        }
        goil.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.groundnutoil)
            intent.putExtra("name","GROUNDNUT OIL")
            startActivity(intent)
        }
    }
    private fun init(){
        eoil=findViewById(R.id.image1)
        goil=findViewById(R.id.image2)
    }
}