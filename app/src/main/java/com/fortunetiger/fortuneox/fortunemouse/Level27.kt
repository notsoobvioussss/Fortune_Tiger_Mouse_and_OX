package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel27Binding

class Level27 : AppCompatActivity() {
    lateinit var lvl27: ActivityLevel27Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl27 = ActivityLevel27Binding.inflate(layoutInflater)
        setContentView(lvl27.root)
        lvl27.ex27.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl27.ne27.setOnClickListener {
            startActivity(Intent(this, Level31::class.java))
            finish()
        }
    }
}