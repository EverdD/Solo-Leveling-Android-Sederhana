package com.example.sololeveling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Firman Nurcahyo - 50421524 - Universitas Gunadarma - Bangkit - Dicoding
class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.apply {
            title = getString(R.string.about_string)
        }
    }
}