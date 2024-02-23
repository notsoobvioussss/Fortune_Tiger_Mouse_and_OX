package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel33Binding

class Level33 : AppCompatActivity() {
    lateinit var lvl33: ActivityLevel33Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl33 = ActivityLevel33Binding.inflate(layoutInflater)
        setContentView(lvl33.root)
        lvl33.ex33.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl33.ne33.setOnClickListener {
            startActivity(Intent(this, Level34::class.java))
            finish()
        }
    }
}