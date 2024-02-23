package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel11Binding

class Level11 : AppCompatActivity() {
    lateinit var lvl11: ActivityLevel11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        lvl11 = ActivityLevel11Binding.inflate(layoutInflater)
        setContentView(lvl11.root)
        lvl11.ex11.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl11.go11.setOnClickListener {
            startActivity(Intent(this, Level12::class.java))
            finish()
        }
    }
}