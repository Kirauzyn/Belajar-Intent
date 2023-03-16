package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent -> run {
                val IntentBiasa = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(IntentBiasa)

            }
            R.id.btn_pindah_data -> run {
                val intentData = Intent(this@MainActivity, PindahDataActivity::class.java)
                intentData.putExtra(PindahDataActivity.EXTRA_TEXT,"Halo, ayo belajar Kotlin")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek -> run {
                val cars = Cars(
                    "Toyota Yaris",
                    2020,
                    "BM 2020 SAR"
                )

                val intentObjek = Intent(this@MainActivity, PindahObjekMainActivity::class.java)
                intentObjek.putExtra(PindahObjekMainActivity.EXTRA_CARS,cars)
                startActivity(intentObjek)
            }
        }

    }
}