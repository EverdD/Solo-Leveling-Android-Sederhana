package com.example.sololeveling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
//Firman Nurcahyo - 50421524 - Universitas Gunadarma - Bangkit - Dicoding
class Details_Character : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_character)

        supportActionBar?.apply {
            title = getString(R.string.details_string)
        }

        val photo = findViewById<ImageView>(R.id.img_photo)
        val name = findViewById<TextView>(R.id.item_name)
        val detail = findViewById<TextView>(R.id.item_detail)
        val voice = findViewById<TextView>(R.id.item_voice)

        val intentData = intent
        photo.setImageResource(intentData.getIntExtra("photo", 0))
        name.text = intentData.getStringExtra("name")
        detail.text = intentData.getStringExtra("detail")
        voice.text = intentData.getStringExtra("voice")
    }
}