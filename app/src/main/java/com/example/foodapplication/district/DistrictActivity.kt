package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import com.example.foodapplication.HomeActivity
import com.example.foodapplication.R
import com.example.foodapplication.cart.CartActivity
import com.example.foodapplication.profile.ProfileActivity
import com.example.foodapplication.search.SearchActivity

class DistrictActivity : AppCompatActivity() {
    private lateinit var profile: ImageView
    private lateinit var district: ImageView
    private lateinit var cart: ImageView
    private lateinit var home: ImageView
    private lateinit var search: ImageView
    private lateinit var d1: ImageView
    private lateinit var d2: ImageView
    private lateinit var d3: ImageView
    private lateinit var d4: ImageView
    private lateinit var d5: ImageView
    private lateinit var d6: ImageView
    private lateinit var d7: ImageView
    private lateinit var d8: ImageView
    private lateinit var d9: ImageView
    private lateinit var d10: ImageView
    private lateinit var d11: ImageView
    private lateinit var d12: ImageView
    private lateinit var d13: ImageView
    private lateinit var d14: ImageView
    private lateinit var d15: ImageView
    private lateinit var d16: ImageView
    private lateinit var d17: ImageView
    private lateinit var d18: ImageView
    private lateinit var d19: ImageView
    private lateinit var d20: ImageView
    private lateinit var d21: ImageView
    private lateinit var d22: ImageView
    private lateinit var d23: ImageView
    private lateinit var d24: ImageView
    private lateinit var d25: ImageView
    private lateinit var d26: ImageView
    private lateinit var d27: ImageView
    private lateinit var d28: ImageView
    private lateinit var d29: ImageView
    private lateinit var d30: ImageView
    private lateinit var d31: ImageView
    private lateinit var d32: ImageView
    private lateinit var d33: ImageView
    private lateinit var d34: ImageView
    private lateinit var d35: ImageView
    private lateinit var d36: ImageView
    private lateinit var d37: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_district)
        supportActionBar?.hide()

        init()
        images1()
        images2()
        images3()
        images4()
        images5()
        images6()
        images7()
        images8()
        images9()
        images10()
        images11()
        images12()
        images13()
        images14()
        images15()
        images16()
        images17()
        images18()
        images19()
        images20()
        images21()
        images22()
        images23()
        images24()
        images25()
        images26()
        images27()
        images28()
        images29()
        images30()
        images31()
        images32()
        images33()
        images34()
        images35()
        images36()
        images37()

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

        search.setOnClickListener(){
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }


        d1.setOnClickListener(){
            val intent = Intent(this,CoimbatoreActivity::class.java)
            startActivity(intent)
        }

        d2.setOnClickListener(){
            val intent = Intent(this,TiruppurActivity::class.java)
            startActivity(intent)
        }

        d3.setOnClickListener(){
            val intent = Intent(this,TirunelveliActivity::class.java)
            startActivity(intent)
        }

        d4.setOnClickListener(){
            val intent = Intent(this,ChennaiActivity::class.java)
            startActivity(intent)
        }

        d5.setOnClickListener(){
            val intent = Intent(this,ChengalpattuActivity::class.java)
            startActivity(intent)
        }

        d6.setOnClickListener(){
            val intent = Intent(this,AriyalurActivity::class.java)
            startActivity(intent)
        }

        d7.setOnClickListener(){
            val intent = Intent(this,CuddaloreActivity::class.java)
            startActivity(intent)
        }

        d8.setOnClickListener(){
            val intent = Intent(this,DharmapuriActivity::class.java)
            startActivity(intent)
        }

        d9.setOnClickListener(){
            val intent = Intent(this,DindigulActivity::class.java)
            startActivity(intent)
        }

        d10.setOnClickListener(){
            val intent = Intent(this,ErodeActivity::class.java)
            startActivity(intent)
        }

        d11.setOnClickListener(){
            val intent = Intent(this,KallakurichiActivity::class.java)
            startActivity(intent)
        }

        d12.setOnClickListener(){
            val intent = Intent(this,KancheepuramActivity::class.java)
            startActivity(intent)
        }

        d13.setOnClickListener(){
            val intent = Intent(this,KarurActivity::class.java)
            startActivity(intent)
        }

        d14.setOnClickListener(){
            val intent = Intent(this,KanyakumariActivity::class.java)
            startActivity(intent)
        }

        d15.setOnClickListener(){
            val intent = Intent(this,KrishnagiriActivity::class.java)
            startActivity(intent)
        }

        d16.setOnClickListener(){
            val intent = Intent(this,MaduraiActivity::class.java)
            startActivity(intent)
        }

        d17.setOnClickListener(){
            val intent = Intent(this,NagappattinamActivity::class.java)
            startActivity(intent)
        }

        d18.setOnClickListener(){
            val intent = Intent(this,NamakkalActivity::class.java)
            startActivity(intent)
        }

        d19.setOnClickListener(){
            val intent = Intent(this,NilgirisActivity::class.java)
            startActivity(intent)
        }

        d20.setOnClickListener(){
            val intent = Intent(this,PerambalurActivity::class.java)
            startActivity(intent)
        }

        d21.setOnClickListener(){
            val intent = Intent(this,PudukkottaiActivity::class.java)
            startActivity(intent)
        }

        d22.setOnClickListener(){
            val intent = Intent(this,RamanathapuramActivity::class.java)
            startActivity(intent)
        }

        d23.setOnClickListener(){
            val intent = Intent(this,RanipetActivity::class.java)
            startActivity(intent)
        }

        d24.setOnClickListener(){
            val intent = Intent(this,SalemActivity::class.java)
            startActivity(intent)
        }

        d25.setOnClickListener(){
            val intent = Intent(this,SivagangaiActivity::class.java)
            startActivity(intent)
        }

        d26.setOnClickListener(){
            val intent = Intent(this,TenkasiActivity::class.java)
            startActivity(intent)
        }

        d27.setOnClickListener(){
            val intent = Intent(this,ThanjavurActivity::class.java)
            startActivity(intent)
        }

        d28.setOnClickListener(){
            val intent = Intent(this,TheniActivity::class.java)
            startActivity(intent)
        }

        d29.setOnClickListener(){
            val intent = Intent(this,ThiruvallurActivity::class.java)
            startActivity(intent)
        }

        d30.setOnClickListener(){
            val intent = Intent(this,ThoothukudiActivity::class.java)
            startActivity(intent)
        }

        d31.setOnClickListener(){
            val intent = Intent(this,TiruppathurActivity::class.java)
            startActivity(intent)
        }

        d32.setOnClickListener(){
            val intent = Intent(this,TiruvannamalaiActivity::class.java)
            startActivity(intent)
        }

        d33.setOnClickListener(){
            val intent = Intent(this,TiruvarurActivity::class.java)
            startActivity(intent)
        }

        d34.setOnClickListener(){
            val intent = Intent(this,TrichyActivity::class.java)
            startActivity(intent)
        }

        d35.setOnClickListener(){
            val intent = Intent(this,VelloreActivity::class.java)
            startActivity(intent)
        }

        d36.setOnClickListener(){
            val intent = Intent(this,VillupuramActivity::class.java)
            startActivity(intent)
        }

        d37.setOnClickListener(){
            val intent = Intent(this,VirudhunagarActivity::class.java)
            startActivity(intent)
        }





    }

    private fun init() {
        profile = findViewById(R.id.profile)
        district = findViewById(R.id.district)
        cart = findViewById(R.id.cart)
        home = findViewById(R.id.home)
        search = findViewById(R.id.search)
        d1=findViewById(R.id.imgd1)
        d2=findViewById(R.id.imgd2)
        d3=findViewById(R.id.imgd3)
        d4=findViewById(R.id.imgd4)
        d5=findViewById(R.id.imgd5)
        d6=findViewById(R.id.imgd6)
        d7=findViewById(R.id.imgd7)
        d8=findViewById(R.id.imgd8)
        d9=findViewById(R.id.imgd9)
        d10=findViewById(R.id.imgd10)
        d11=findViewById(R.id.imgd11)
        d12=findViewById(R.id.imgd12)
        d13=findViewById(R.id.imgd13)
        d14=findViewById(R.id.imgd14)
        d15=findViewById(R.id.imgd15)
        d16=findViewById(R.id.imgd16)
        d17=findViewById(R.id.imgd17)
        d18=findViewById(R.id.imgd18)
        d19=findViewById(R.id.imgd19)
        d20=findViewById(R.id.imgd20)
        d21=findViewById(R.id.imgd21)
        d22=findViewById(R.id.imgd22)
        d23=findViewById(R.id.imgd23)
        d24=findViewById(R.id.imgd24)
        d25=findViewById(R.id.imgd25)
        d26=findViewById(R.id.imgd26)
        d27=findViewById(R.id.imgd27)
        d28=findViewById(R.id.imgd28)
        d29=findViewById(R.id.imgd29)
        d30=findViewById(R.id.imgd30)
        d31=findViewById(R.id.imgd31)
        d32=findViewById(R.id.imgd32)
        d33=findViewById(R.id.imgd33)
        d34=findViewById(R.id.imgd34)
        d35=findViewById(R.id.imgd35)
        d36=findViewById(R.id.imgd36)
        d37=findViewById(R.id.imgd37)

    }

    private fun images1() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.silk_sarees,R.drawable.palm,R.drawable.automative_components,R.drawable.motor,R.drawable.car_parts)
            override fun run() {
                d1.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }

    private fun images2() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.t_shirt_1,R.drawable.pant,R.drawable.shirts,R.drawable.t_shirt_2,R.drawable.shorts)
            override fun run() {
                d2.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }

    private fun images3() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.halwa,R.drawable.forging_components,R.drawable.glass_slides,R.drawable.oil_expeller,R.drawable.tamarind_chilli)
            override fun run() {
                d3.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }

    private fun images4() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.automobile_accessiors,R.drawable.medical_equipments,R.drawable.organic_foods,R.drawable.oil_expeller,R.drawable.tamarind_chilli)
            override fun run() {
                d4.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }

    private fun images5() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d5.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }

    private fun images6() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d6.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images7() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d7.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images8() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d8.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images9() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d9.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images10() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d10.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images11() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d11.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images12() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d12.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images13() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d13.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images14() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d14.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images15() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d15.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images16() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d16.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images17() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d17.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
    private fun images18() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d18.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images19() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d19.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images20() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d20.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images21() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d21.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images22() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d22.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images23() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d23.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images24() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d24.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images25() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d25.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images26() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d26.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images27() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d27.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images28() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d28.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images29() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d29.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images30() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d30.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images31() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d31.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images32() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d32.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images33() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d33.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images34() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d34.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images35() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d35.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images36() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d36.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }private fun images37() {

        val handler = Handler()
        val runnable: Runnable = object : Runnable {
            var i = 0
            val imageArray = intArrayOf(R.drawable.cashew_nuts,R.drawable.kaju_katli,R.drawable.indigo_powder)
            override fun run() {
                d37.setImageResource(imageArray.get(i))
                i++
                if (i > imageArray.size - 1) {
                    i = 0
                }
                handler.postDelayed(this, 2000)
            }
        }
        handler.postDelayed(runnable, 2000)
    }
}