package com.tatav.kotlinsession

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.tatav.kotlinsession.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Apply animations to rings
        val outerRing = findViewById<ImageView>(R.id.ring_outer)
        val middleRing = findViewById<ImageView>(R.id.ring_middle)
        val innerRing = findViewById<ImageView>(R.id.ring_inner)

        val outerAnim = AnimationUtils.loadAnimation(this, R.anim.outer_ring_anim)
        val middleAnim = AnimationUtils.loadAnimation(this, R.anim.middle_ring_anim)
        val innerAnim = AnimationUtils.loadAnimation(this, R.anim.inner_ring_anim)

        outerRing.startAnimation(outerAnim)
        middleRing.startAnimation(middleAnim)
        innerRing.startAnimation(innerAnim)

        // Delay the navigation to LoginActivity after animations
        Handler(Looper.getMainLooper()).postDelayed({
            navigateToLogin()
        }, 2000) // Delay in milliseconds (adjust based on animation timing)
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish() // Prevent going back to the splash screen
    }
}
