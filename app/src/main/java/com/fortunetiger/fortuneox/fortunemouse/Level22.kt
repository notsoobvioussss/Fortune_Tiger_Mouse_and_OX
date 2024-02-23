package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel22Binding

class Level22 : AppCompatActivity() {
    lateinit var lvl22: ActivityLevel22Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl22 = ActivityLevel22Binding.inflate(layoutInflater)
        setContentView(lvl22.root)
        lvl22.ex22.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl22.ar22.setOnClickListener {
            startActivity(Intent(this, Level23::class.java))
            finish()
        }
    }
}