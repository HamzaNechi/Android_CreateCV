package com.example.cv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val name=findViewById<TextView>(R.id.nom)
        name.text=intent.getStringExtra("android").toString();

        val email=findViewById<TextView>(R.id.email_result);
        email.text=intent.getStringExtra("email").toString();
        val btnSkills=findViewById<Button>(R.id.btnSkills);
        val btnHobbies=findViewById<Button>(R.id.hobbies);
        val btnLanguage=findViewById<Button>(R.id.language);

        btnSkills.setOnClickListener{
            replaceFragment(SkillsFragment());
        }

        btnHobbies.setOnClickListener{
            replaceFragment(HobbiesFragment());
        }

        btnLanguage.setOnClickListener{
            replaceFragment(LangFragment());
        }
    }

    private fun replaceFragment(fragment :Fragment){
        val data=Bundle();
        //send skills result to fragment skills
        /**if(fragment == SkillsFragment()){
            val android =intent.getStringExtra("android");
            val ios =intent.getStringExtra("ios");
            val flutter =intent.getStringExtra("flutter");
            data.putString("android",android);
            data.putString("ios",ios);
            data.putString("flutter",flutter);
        }**/
        data.putString("android","7");
        fragment.arguments=data;
        val fragmentManager = supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentcontainer,fragment)
        fragmentTransaction.commit()
    }
}