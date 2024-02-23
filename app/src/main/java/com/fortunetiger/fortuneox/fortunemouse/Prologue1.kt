package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityPrologue1Binding

class Prologue1 : AppCompatActivity() {
    lateinit var pr1: ActivityPrologue1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        pr1 = ActivityPrologue1Binding.inflate(layoutInflater)
        setContentView(pr1.root)
        pr1.pe1.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        pr1.pn1.setOnClickListener {
            startActivity(Intent(this, Prologue2::class.java))
        }
    }
}