package com.example.cv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView

class CareerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)
        val toolbar=findViewById<Toolbar>(R.id.myToolbar);
        setSupportActionBar(toolbar);
        toolbar.title="Your career";
        supportActionBar!!.setDisplayHomeAsUpEnabled(/* showHomeAsUp = */ true)


        val btnExperience=findViewById<Button>(R.id.experience);
        val btnEducation=findViewById<Button>(R.id.education);

        replaceFragment(EducationFragment());

        btnExperience.setOnClickListener{
            replaceFragment(ExperienceFragment());
        }

        btnEducation.setOnClickListener{
            replaceFragment(EducationFragment());
        }

    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container_fragment,fragment)
        fragmentTransaction.commit()
    }
}