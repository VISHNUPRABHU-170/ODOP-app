package com.example.foodapplication.search

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import com.example.foodapplication.R
import com.example.foodapplication.district.*

class SearchActivity : AppCompatActivity() {
    private lateinit var search: SearchView
    private lateinit var invalid: TextView
    private lateinit var oops: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        init()

        search.setOnClickListener(){
            val str: String = search.query.toString().toLowerCase()
            if(str.contains("ariyalur")){
                val intent = Intent(this, AriyalurActivity::class.java)
                startActivity(intent)
            }else  if(str.contains("chengalpattu")){
                val intent = Intent(this, ChengalpattuActivity::class.java)
                startActivity(intent)
            }else if(str.contains("chennai")){
                val intent = Intent(this, ChennaiActivity::class.java)
                startActivity(intent)
            }else if(str.contains("coimbatore")){
                val intent = Intent(this, CoimbatoreActivity::class.java)
                startActivity(intent)
            }else if(str.contains("cuddalore")){
                val intent = Intent(this, CuddaloreActivity::class.java)
                startActivity(intent)
            }else if(str.equals("dharmapuram")){
                val intent = Intent(this, DharmapuriActivity::class.java)
                startActivity(intent)
            }else if(str.equals("dindigul")){
                val intent = Intent(this, DindigulActivity::class.java)
                startActivity(intent)
            }else if(str.equals("erode")){
                val intent = Intent(this, ErodeActivity::class.java)
                startActivity(intent)
            }else if(str.equals("kallakurichi")){
                val intent = Intent(this, KallakurichiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("kancheepuram")){
                val intent = Intent(this, KancheepuramActivity::class.java)
                startActivity(intent)
            }else if(str.equals("kanyakumari")){
                val intent = Intent(this, KanyakumariActivity::class.java)
                startActivity(intent)
            }else if(str.equals("karur")){
                val intent = Intent(this, KarurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("krishnagiri")){
                val intent = Intent(this, KrishnagiriActivity::class.java)
                startActivity(intent)
            }else if(str.equals("madurai")){
                val intent = Intent(this, MaduraiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("nagappattinam")){
                val intent = Intent(this, NagappattinamActivity::class.java)
                startActivity(intent)
            }else if(str.equals("namakkal")){
                val intent = Intent(this, NamakkalActivity::class.java)
                startActivity(intent)
            }else if(str.equals("nilgiris")){
                val intent = Intent(this, NilgirisActivity::class.java)
                startActivity(intent)
            }else if(str.equals("perambalur")){
                val intent = Intent(this, PerambalurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("pudukkottai")){
                val intent = Intent(this, PudukkottaiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("ramanathapuram")){
                val intent = Intent(this, RamanathapuramActivity::class.java)
                startActivity(intent)
            }else if(str.equals("ranipet")){
                val intent = Intent(this, RanipetActivity::class.java)
                startActivity(intent)
            }else if(str.equals("salem")){
                val intent = Intent(this, SalemActivity::class.java)
                startActivity(intent)
            }else if(str.equals("sivagangai")){
                val intent = Intent(this, SivagangaiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("tenkasi")){
                val intent = Intent(this, TenkasiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("thanjavur")){
                val intent = Intent(this, ThanjavurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("theni")){
                val intent = Intent(this, TheniActivity::class.java)
                startActivity(intent)
            }else if(str.equals("thiruvallur")){
                val intent = Intent(this, ThiruvallurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("thoothukudi")){
                val intent = Intent(this, ThoothukudiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("tirunelveli")){
                val intent = Intent(this, TirunelveliActivity::class.java)
                startActivity(intent)
            }else if(str.equals("tiruppathur")){
                val intent = Intent(this, TiruppathurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("tiruppur")){
                val intent = Intent(this, TiruppurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("tiruvannamalai")){
                val intent = Intent(this, TiruvannamalaiActivity::class.java)
                startActivity(intent)
            }else if(str.equals("tiruvarur")){
                val intent = Intent(this, TiruvarurActivity::class.java)
                startActivity(intent)
            }else if(str.equals("trichy")){
                val intent = Intent(this, TrichyActivity::class.java)
                startActivity(intent)
            }else if(str.equals("vellore")){
                val intent = Intent(this, VelloreActivity::class.java)
                startActivity(intent)
            }else if(str.equals("villupuram")){
                val intent = Intent(this, VillupuramActivity::class.java)
                startActivity(intent)
            }else if(str.equals("virudhunagar")){
                val intent = Intent(this, VirudhunagarActivity::class.java)
                startActivity(intent)
            }else{
                invalid.visibility = View.VISIBLE
                oops.visibility = View.VISIBLE
            }
        }


    }

    private fun init(){
        search = findViewById(R.id.search)
        invalid = findViewById(R.id.invalid)
        oops = findViewById(R.id.oops)
        oops.visibility = View.INVISIBLE
        invalid.visibility = View.INVISIBLE
    }
}