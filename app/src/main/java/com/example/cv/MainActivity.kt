package com.example.cv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    lateinit var handler: Handler;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler=Handler();
        handler.postDelayed({
            val intent=Intent(this,FormActivity::class.java)
            startActivity(intent)
            finish()

        }, 3000);
    }
}
