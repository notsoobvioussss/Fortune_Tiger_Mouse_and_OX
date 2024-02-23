package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityAboutBinding

class About : AppCompatActivity() {
    lateinit var about_binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        about_binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(about_binding.root)
        about_binding.abExit.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}