package com.example.foodapplication.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.foodapplication.R
import com.example.foodapplication.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
//import com.example.foodapplication.databinding.ActivityReadDataBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var edit: Button
    private lateinit var auth:FirebaseAuth
    private lateinit var signout: Button
    //private lateinit var binding: ActivityReadDataBinding
    private lateinit var dbRef: DatabaseReference
    private lateinit var name: TextView
    private lateinit var number : TextView
    private lateinit var mailid: TextView
    private lateinit var location: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        //binding=ActivityReadDataBinding.inflate(layoutInflater)

        init()
        val uid=auth.currentUser?.uid.toString()
        readData(uid)

        edit.setOnClickListener(){
            val intent =Intent(this, EditprofileActivity::class.java)
            startActivity(intent)
        }

        signout.setOnClickListener(){
            auth.signOut()
            startActivity(Intent(this, LoginActivity::class.java))
        }


    }
    private fun init(){
        edit=findViewById(R.id.Edit)
        auth=FirebaseAuth.getInstance()
        signout=findViewById(R.id.signout)
        dbRef=FirebaseDatabase.getInstance().getReference("User Information")
        name=findViewById(R.id.name)
        number=findViewById(R.id.number)
        location=findViewById(R.id.address)
        mailid=findViewById(R.id.mailid)
    }

    private fun readData(uid: String){
        dbRef.child(uid).get().addOnSuccessListener {
            val nam = it.child("str1").value
            val num = it.child("str2").value
            val mail = it.child("str3").value
            val lo = it.child("str4").value
            name.text=nam.toString()
            number.text=num.toString()
            mailid.text=mail.toString()
            location.text=lo.toString()
        }.addOnFailureListener(){
            Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show()
        }
    }
}


