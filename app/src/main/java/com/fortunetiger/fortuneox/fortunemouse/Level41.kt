package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel41Binding

class Level41 : AppCompatActivity() {
    lateinit var lvl41: ActivityLevel41Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl41 = ActivityLevel41Binding.inflate(layoutInflater)
        setContentView(lvl41.root)
        lvl41.ex41.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl41.go41.setOnClickListener {
            startActivity(Intent(this, Level42::class.java))
            finish()
        }
    }
}