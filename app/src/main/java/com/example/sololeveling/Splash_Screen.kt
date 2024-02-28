package com.example.sololeveling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
//Firman Nurcahyo - 50421524 - Universitas Gunadarma - Bangkit - Dicoding
class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@Splash_Screen,MainActivity::class.java))
            finish()
        }, 1500)
    }
}