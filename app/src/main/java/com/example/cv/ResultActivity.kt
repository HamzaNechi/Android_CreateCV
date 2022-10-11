package com.example.cv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val slider =findViewById<TextView>(R.id.slider);
        val lang=findViewById<TextView>(R.id.checkLang);
        val hob=findViewById<TextView>(R.id.checkHobbies);

        //get from Skills
        slider.text=intent.getStringExtra("android");
        if (intent.getStringExtra("ar") != null){
            lang.append(intent.getStringExtra("ar"));
        }

        if (intent.getStringExtra("fr") != null){
            lang.append(intent.getStringExtra("fr"));
        }

        if (intent.getStringExtra("eng") != null){
            lang.append(intent.getStringExtra("eng"));
        }

        hob.text="test";


    }
}