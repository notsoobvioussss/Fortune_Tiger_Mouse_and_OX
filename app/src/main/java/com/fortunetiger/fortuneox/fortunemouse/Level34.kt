package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel34Binding

class Level34 : AppCompatActivity() {
    lateinit var lvl34: ActivityLevel34Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl34 = ActivityLevel34Binding.inflate(layoutInflater)
        setContentView(lvl34.root)
        lvl34.ex34.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl34.ar34.setOnClickListener {
            startActivity(Intent(this, Level35::class.java))
            finish()
        }
    }
}