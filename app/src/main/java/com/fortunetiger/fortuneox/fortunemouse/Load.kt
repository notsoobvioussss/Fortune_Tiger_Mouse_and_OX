package com.fortunetiger.fortuneox.fortunemouse


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Load : AppCompatActivity() {

    private lateinit var container: ConstraintLayout
    private lateinit var loaderImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        container = findViewById(R.id.container)
        loaderImage = findViewById(R.id.loaderImage)

        Handler().postDelayed({
            runOnUiThread {
                changeBackground()
                loaderImage.visibility = View.VISIBLE
                startLoaderBlinkAnimation()
            }
        }, 2000)

        Handler().postDelayed({
            redirectToMenuActivity()
        }, 5000)
    }

    private fun startLoaderBlinkAnimation() {
        val blinkAnimation = AlphaAnimation(1f, 0f)
        blinkAnimation.duration = 500
        blinkAnimation.repeatCount = Animation.INFINITE

        loaderImage.startAnimation(blinkAnimation)
    }

    private fun changeBackground() {
        container.setBackgroundResource(R.drawable.load2)
    }

    private fun redirectToMenuActivity() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}
