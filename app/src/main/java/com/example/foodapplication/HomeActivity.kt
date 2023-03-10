package com.example.foodapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.cart.CartActivity
import com.example.foodapplication.district.DistrictActivity
import com.example.foodapplication.profile.ProfileActivity
import com.example.foodapplication.search.SearchActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*


class HomeActivity : AppCompatActivity() {

    private lateinit var profile: ImageView
    private lateinit var district: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var location: TextView
    private lateinit var auth: FirebaseAuth
    private lateinit var dbRef: DatabaseReference
    private lateinit var uid: String
    private lateinit var search: ImageView
    private lateinit var scroll: ScrollView
    private lateinit var hscroll: HorizontalScrollView
    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var img3: ImageView
    private lateinit var img4: ImageView
    private lateinit var img5: ImageView
    private lateinit var img6: ImageView
    private lateinit var img7: ImageView
    private lateinit var img8: ImageView
    private lateinit var img9: ImageView
    private lateinit var img10: ImageView
    private lateinit var img11: ImageView
    private lateinit var img12: ImageView
    private lateinit var img13: ImageView
    private lateinit var img14: ImageView
    private lateinit var img15: ImageView
    private lateinit var t1: ImageView
    private lateinit var t2: ImageView
    private lateinit var t3: ImageView
    private lateinit var t4: ImageView
    private lateinit var t5: ImageView
    private lateinit var t6: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()


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
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        search.setOnClickListener(){
            val intent=Intent(this,SearchActivity::class.java)
            startActivity(intent)
        }


        img1.setOnClickListener(){
            val intent = Intent(this@HomeActivity, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.shirts)
            intent.putExtra("name","SHIRTS")
            startActivity(intent)
        }

        img2.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.pants)
            intent.putExtra("name","PANTS")
            startActivity(intent)
        }

        img3.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.t_shirt_1)
            intent.putExtra("name","T SHIRT")
            startActivity(intent)
        }

        img4.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.sweet)
            intent.putExtra("name","SWEET")
            startActivity(intent)
        }

        img5.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.bags)
            intent.putExtra("name","SHOOL BAGS")
            startActivity(intent)
        }

        img6.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.mangoo)
            intent.putExtra("name","MANGO")
            startActivity(intent)
        }

        img7.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tea_powder)
            intent.putExtra("name","TEA POWDER")
            startActivity(intent)
        }

        img8.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.edibleoil)
            intent.putExtra("name","EDIBLE OIL")
            startActivity(intent)
        }

        img9.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.groundnutoil)
            intent.putExtra("name","GROUNDNUT OIL")
            startActivity(intent)
        }

        img10.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.millet)
            intent.putExtra("name","MILLET")
            startActivity(intent)
        }

        img11.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.coir_ropes)
            intent.putExtra("name","COIR ROPES")
            startActivity(intent)
        }

        img12.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tanjore_painting)
            intent.putExtra("name","THANJAVUR PAINTS")
            startActivity(intent)
        }

        img13.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.garlic)
            intent.putExtra("name","GARLIC")
            startActivity(intent)
        }

        img14.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.rices)
            intent.putExtra("name","RICE")
            startActivity(intent)
        }

        img15.setOnClickListener(){
            val intent = Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.port)
            intent.putExtra("name","PORT")
            startActivity(intent)
        }



    }




    private fun init(){
        profile=findViewById(R.id.profile)
        district=findViewById(R.id.district)
        cart=findViewById(R.id.cart)
        home=findViewById(R.id.home)
        location=findViewById(R.id.location)
        auth= FirebaseAuth.getInstance()
        search=findViewById(R.id.search)
        dbRef=FirebaseDatabase.getInstance().getReference("User Information")
        val uid=auth.currentUser?.uid.toString()
        dbRef.child(uid).get().addOnSuccessListener {
            val lo = it.child("str4").value
            location.text="Delivery to - ${lo.toString()}"
        }
        hscroll=findViewById(R.id.hscroll)
        img1=findViewById(R.id.image1)
        img2=findViewById(R.id.image2)
        img3=findViewById(R.id.image3)
        img4=findViewById(R.id.image4)
        img5=findViewById(R.id.image5)
        img6=findViewById(R.id.image6)
        img7=findViewById(R.id.image7)
        img8=findViewById(R.id.image8)
        img9=findViewById(R.id.image9)
        img10=findViewById(R.id.image10)
        img11=findViewById(R.id.image11)
        img12=findViewById(R.id.image12)
        img13=findViewById(R.id.image13)
        img14=findViewById(R.id.image14)
        img15=findViewById(R.id.image15)
        t1=findViewById(R.id.imageV1)
        t2=findViewById(R.id.imageV2)
        t3=findViewById(R.id.imageV3)
        t4=findViewById(R.id.imageV4)
        t5=findViewById(R.id.imageV5)
        t6=findViewById(R.id.imageV6)


    }

}