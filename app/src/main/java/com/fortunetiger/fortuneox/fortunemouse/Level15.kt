package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel15Binding

class Level15 : AppCompatActivity() {
    lateinit var lvl15: ActivityLevel15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        lvl15 = ActivityLevel15Binding.inflate(layoutInflater)
        setContentView(lvl15.root)
        lvl15.ex15.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl15.ne15.setOnClickListener {
            startActivity(Intent(this, Level21::class.java))
            finish()
        }
    }
}