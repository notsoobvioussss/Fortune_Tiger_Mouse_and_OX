package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel25Binding

class Level25 : AppCompatActivity() {
    lateinit var lvl25: ActivityLevel25Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl25 = ActivityLevel25Binding.inflate(layoutInflater)
        setContentView(lvl25.root)
        lvl25.ex25.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl25.ne25.setOnClickListener {
            startActivity(Intent(this, Level26::class.java))
            finish()
        }
    }
}