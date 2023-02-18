package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class ChennaiActivity : AppCompatActivity() {
    private lateinit var saree: ImageView
    private lateinit var automobile: ImageView
    private lateinit var organicfoods: ImageView
    private lateinit var medicalequip: ImageView
    private lateinit var paint: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chennai)
        init()

        saree.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.kancheepuram_silksaree)
            intent.putExtra("name","KANCHEEPURAM SILK SAREE")
            startActivity(intent)
        }

        automobile.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.automobile_accessiors)
            intent.putExtra("name","AUTOMOBILE ACCESSORIES")
            startActivity(intent)
        }

        paint.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tanjore_painting)
            intent.putExtra("name","TANJORE PAINTING")
            startActivity(intent)
        }

        medicalequip.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.medical_equipments)
            intent.putExtra("name","MEDICAL EQUIPMENTS")
            startActivity(intent)
        }

        organicfoods.setOnClickListener(){
            val intent= Intent(this,BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.organic_foods)
            intent.putExtra("name","ORGANIC FOODS")
            startActivity(intent)
        }

    }

    private fun init(){
        saree=findViewById(R.id.image1)
        automobile=findViewById(R.id.image2)
        paint=findViewById(R.id.image3)
        organicfoods=findViewById(R.id.image4)
        medicalequip=findViewById(R.id.image5)
    }
}