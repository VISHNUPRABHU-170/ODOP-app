package com.example.foodapplication.cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.foodapplication.OrderActivity
import com.example.foodapplication.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class BuyActivity : AppCompatActivity() {

    private lateinit var add: Button
    private lateinit var buy: Button
    private lateinit var dbRef: DatabaseReference
    private lateinit var auth: FirebaseAuth
    private lateinit var uid: String
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        init()

        dbRef= FirebaseDatabase.getInstance().getReference("Cart images")

        buy.setOnClickListener(){
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }

        val img: ImageView = findViewById(R.id.img)
        val text: TextView = findViewById(R.id.name)
        val str: String
        val bundle: Bundle = intent.extras!!
        val resId: Int = bundle.getInt("pic")
        val intent = intent
        str=intent.getStringExtra("name").toString()
        text.text=str
        img.setImageResource(resId)

        add.setOnClickListener() {
            Toast.makeText(this,"Successfully Added to cart",Toast.LENGTH_SHORT).show()
            savedata(str)
        }

    }
    private fun savedata(str: String){
        val details=dbRef.push().key!!
        val info= DataModel(str)
        uid=auth.currentUser?.uid.toString()
        dbRef.child(uid).setValue(info)
            .addOnCompleteListener(){

            }.addOnFailureListener(){
                Toast.makeText(this,"Failed to Save",Toast.LENGTH_SHORT).show()
            }
    }

    private fun init(){
        add=findViewById(R.id.add)
        buy=findViewById(R.id.buy)
        auth=FirebaseAuth.getInstance()
    }
}