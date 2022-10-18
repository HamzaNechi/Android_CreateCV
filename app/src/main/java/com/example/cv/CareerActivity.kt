package com.example.cv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentContainerView

class CareerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)
        val toolbar=findViewById<Toolbar>(R.id.myToolbar);
        setSupportActionBar(toolbar);
        toolbar.title="Your career";
        val container=findViewById<FragmentContainerView>(R.id.container_fragment);
        val btnExperience=findViewById<Button>(R.id.experience);
        val btnEducation=findViewById<Button>(R.id.education);
    }
}