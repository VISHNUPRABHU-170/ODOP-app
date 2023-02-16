package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class TirupurActivity : AppCompatActivity() {
    private lateinit var tshirt1: ImageView
    private lateinit var tshirt2: ImageView
    private lateinit var shorts: ImageView
    private lateinit var pant: ImageView
    private lateinit var shirts: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tirupur)
        init()

        tshirt1.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic", R.drawable.t_shirt_1)
            intent.putExtra("name","T SHIRT")
            startActivity(intent)
        }

        tshirt2.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic", R.drawable.t_shirt_2)
            intent.putExtra("name","T SHIRT")
            startActivity(intent)
        }

        shorts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic", R.drawable.shorts)
            intent.putExtra("name","SHORTS")
            startActivity(intent)
        }

        pant.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic", R.drawable.pant)
            intent.putExtra("name","PANT")
            startActivity(intent)
        }

        shirts.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic", R.drawable.shirts)
            intent.putExtra("name","SHIRTS")
            startActivity(intent)
        }
    }

    private fun init(){
        tshirt1=findViewById(R.id.image1)
        tshirt2=findViewById(R.id.image2)
        shorts=findViewById(R.id.image4)
        pant=findViewById(R.id.image3)
        shirts=findViewById(R.id.image5)
    }
}