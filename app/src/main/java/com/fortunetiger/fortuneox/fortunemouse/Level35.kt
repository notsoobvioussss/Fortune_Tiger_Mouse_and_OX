package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel35Binding

class Level35 : AppCompatActivity() {
    lateinit var lvl35: ActivityLevel35Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl35 = ActivityLevel35Binding.inflate(layoutInflater)
        setContentView(lvl35.root)
        lvl35.ex35.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl35.ne35.setOnClickListener {
            startActivity(Intent(this, Level41::class.java))
            finish()
        }
    }
}