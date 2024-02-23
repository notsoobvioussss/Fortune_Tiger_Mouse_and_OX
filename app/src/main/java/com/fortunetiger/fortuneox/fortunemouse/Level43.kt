package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel43Binding

class Level43 : AppCompatActivity() {
    lateinit var lvl43: ActivityLevel43Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl43 = ActivityLevel43Binding.inflate(layoutInflater)
        setContentView(lvl43.root)
        lvl43.ex43.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl43.ne43.setOnClickListener {
            startActivity(Intent(this, Level44::class.java))
            finish()
        }
    }
}