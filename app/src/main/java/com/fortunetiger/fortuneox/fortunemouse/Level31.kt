package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel31Binding

class Level31 : AppCompatActivity() {
    lateinit var lvl31: ActivityLevel31Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl31 = ActivityLevel31Binding.inflate(layoutInflater)
        setContentView(lvl31.root)
        lvl31.ex31.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl31.go31.setOnClickListener {
            startActivity(Intent(this, Level32::class.java))
            finish()
        }
    }
}