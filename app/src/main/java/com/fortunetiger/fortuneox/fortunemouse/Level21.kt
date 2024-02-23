package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel21Binding

class Level21 : AppCompatActivity() {
    lateinit var lvl21: ActivityLevel21Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        lvl21 = ActivityLevel21Binding.inflate(layoutInflater)
        setContentView(lvl21.root)
        lvl21.ex21.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl21.go21.setOnClickListener {
            startActivity(Intent(this, Level22::class.java))
            finish()
        }
    }
}