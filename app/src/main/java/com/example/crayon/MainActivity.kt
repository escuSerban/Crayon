package com.example.crayon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val canvasView = Canvas(this)
        canvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(canvasView)
        // Set view to completely fit the screen.
        @Suppress("DEPRECATION")
        canvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
    }
}