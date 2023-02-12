package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {
    private lateinit var edit: Button
    private lateinit var auth:FirebaseAuth
    private lateinit var signout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        edit=findViewById(R.id.Edit)
        auth=FirebaseAuth.getInstance()
        signout=findViewById(R.id.signout)

        edit.setOnClickListener(){
            val intent =Intent(this,EditprofileActivity::class.java)
            startActivity(intent)
        }

        signout.setOnClickListener(){
            auth.signOut()
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}