package com.example.foodapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.foodapplication.cart.CartActivity
import com.example.foodapplication.district.CoimbatoreActivity
import com.example.foodapplication.notification.NotificationActivity
import com.example.foodapplication.profile.ProfileActivity
import com.example.foodapplication.search.SearchActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*


class HomeActivity : AppCompatActivity() {

    private lateinit var profile: ImageView
    private lateinit var notification: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var location: TextView
    private lateinit var auth: FirebaseAuth
    private lateinit var dbRef: DatabaseReference
    private lateinit var uid: String
    private lateinit var search: ImageView
    private lateinit var scroll: ScrollView
    private lateinit var d1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()

        profile.setOnClickListener(){
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        notification.setOnClickListener(){
            val intent=Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        cart.setOnClickListener(){
            val intent=Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener(){
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        search.setOnClickListener(){
            startActivity(Intent(this, SearchActivity::class.java))
        }

        d1.setOnClickListener(){
            startActivity(Intent(this, CoimbatoreActivity::class.java))
        }

    }


    private fun init(){
        profile=findViewById(R.id.profile)
        notification=findViewById(R.id.notification)
        cart=findViewById(R.id.cart)
        home=findViewById(R.id.home)
        location=findViewById(R.id.address)
        auth= FirebaseAuth.getInstance()
        dbRef=FirebaseDatabase.getInstance().getReference("User Information")
        val uid=auth.currentUser?.uid.toString()
        dbRef.child(uid).get().addOnSuccessListener {
            val lo = it.child("str4").value
            location.text=lo.toString()
        }
        search=findViewById(R.id.image)
        scroll=findViewById(R.id.scrollView)
        d1=findViewById(R.id.d1)
    }
}