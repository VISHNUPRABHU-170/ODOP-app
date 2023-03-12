package com.example.foodapplication.cart

import android.content.Intent
import android.graphics.BitmapFactory
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import com.example.foodapplication.HomeActivity
import com.example.foodapplication.district.DistrictActivity
import com.example.foodapplication.R
import com.example.foodapplication.databinding.ActivityAriyalurBinding
import com.example.foodapplication.databinding.ActivityMainBinding
import com.example.foodapplication.profile.ProfileActivity
import com.example.foodapplication.search.SearchActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import java.io.File

class CartActivity : AppCompatActivity() {
    private lateinit var profile: ImageView
    private lateinit var district: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var gohome: Button
    private lateinit var search: ImageView
    private lateinit var auth: FirebaseAuth
    private lateinit var dbRef: DatabaseReference
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView
    private lateinit var img: ImageView
    private lateinit var item: ImageView
    private lateinit var minus: ImageView
    private lateinit var plus: ImageView
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        supportActionBar?.hide()

        init()
        val uid=auth.currentUser?.uid.toString()
        readData(uid)
        binding=ActivityMainBinding.inflate(layoutInflater)

        profile.setOnClickListener(){
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        district.setOnClickListener(){
            val intent=Intent(this, DistrictActivity::class.java)
            startActivity(intent)
        }

        cart.setOnClickListener(){
            val intent=Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener(){
            val intent=Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        gohome.setOnClickListener(){
            startActivity(Intent(this, HomeActivity::class.java))
        }

        search.setOnClickListener(){
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        minus.setOnClickListener(){
            item.visibility=View.INVISIBLE
            minus.visibility=View.INVISIBLE
            plus.visibility=View.INVISIBLE
            txt1.visibility= View.VISIBLE
            txt2.visibility=View.VISIBLE
            gohome.visibility=View.VISIBLE
            img.visibility=View.VISIBLE
        }

    }

    private fun readData(uid: String){
        dbRef.child(uid).get().addOnSuccessListener {
        val name = it.child("str").value.toString().toLowerCase()
            if(!name.equals("")){
                txt1.visibility= View.INVISIBLE
                txt2.visibility=View.INVISIBLE
                gohome.visibility=View.INVISIBLE
                img.visibility=View.INVISIBLE
                val storageRef=FirebaseStorage.getInstance().reference.child("Cartimages/$name.png")
                val localfile= File.createTempFile("item","png")
                storageRef.getFile(localfile).addOnSuccessListener {
                    val bitmap=BitmapFactory.decodeFile(localfile.absolutePath)
                    item.setImageBitmap(bitmap)
                }.addOnFailureListener{

                }
                item.visibility=View.VISIBLE
                minus.visibility=View.VISIBLE
                plus.visibility=View.VISIBLE
            }
        }.addOnFailureListener(){
            Toast.makeText(this,"failed", Toast.LENGTH_SHORT).show()
        }

    }

    private fun init() {
        profile = findViewById(R.id.profile)
        district = findViewById(R.id.district)
        cart = findViewById(R.id.cart)
        home = findViewById(R.id.home)
        gohome=findViewById(R.id.gohome)
        search=findViewById(R.id.searchicon)
        dbRef= FirebaseDatabase.getInstance().getReference("Cart images")
        txt1=findViewById(R.id.txt1)
        txt2=findViewById(R.id.txt2)
        img=findViewById(R.id.img)
        item=findViewById(R.id.item)
        item.visibility=View.INVISIBLE
        minus=findViewById(R.id.minus)
        plus=findViewById(R.id.plus)
        minus.visibility=View.INVISIBLE
        plus.visibility=View.INVISIBLE
        auth=FirebaseAuth.getInstance()
    }
}