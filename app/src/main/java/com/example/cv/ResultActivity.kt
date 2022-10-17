package com.example.cv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val toolbar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.myToolbar);
        toolbar.title="Your Resume";
        val name=findViewById<TextView>(R.id.nom)
        name.text=intent.getStringExtra("name").toString();

        val email=findViewById<TextView>(R.id.email_result);
        email.text=intent.getStringExtra("email").toString();

        val btnSkills=findViewById<Button>(R.id.btnSkills);
        val btnHobbies=findViewById<Button>(R.id.hobbies);
        val btnLanguage=findViewById<Button>(R.id.language);

        replaceFragment(SkillsFragment(),"Skills");

        btnSkills.setOnClickListener{
            replaceFragment(SkillsFragment(),"Skills");
        }

        btnHobbies.setOnClickListener{
            replaceFragment(HobbiesFragment(),"Hobbies");
        }

        btnLanguage.setOnClickListener{
            replaceFragment(LangFragment(),"Language");
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.resume->replaceFragment(ResumeFragment(),"Resume");
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment :Fragment,type:String){
        val data=Bundle();
        //send skills result to fragment skills
       if(type == "Skills"){
            val android =intent.getStringExtra("android");
            val ios =intent.getStringExtra("ios");
            val flutter =intent.getStringExtra("flutter");
            data.putString("android",android);
            data.putString("ios",ios);
            data.putString("flutter",flutter);
        }else{
            if(type == "Hobbies"){
                if(intent.getStringExtra("sport") != null){
                    data.putString("sport",intent.getStringExtra("sport"));
                }

                if(intent.getStringExtra("music") != null){
                    data.putString("music",intent.getStringExtra("music"));
                }

                if(intent.getStringExtra("game") != null){
                    data.putString("game",intent.getStringExtra("game"));
                }
            }else{
                if(type=="Language"){
                    if(intent.getStringExtra("ar") != null){
                        data.putString("ar",intent.getStringExtra("ar"));
                    }

                    if(intent.getStringExtra("fr") != null){
                        data.putString("fr",intent.getStringExtra("fr"));
                    }

                    if(intent.getStringExtra("eng") != null){
                        data.putString("eng",intent.getStringExtra("eng"));
                    }
                }else{
                    data.putString("nom",intent.getStringExtra("name").toString());
                    data.putString("age",intent.getStringExtra("age").toString());
                    data.putString("genre",intent.getStringExtra("genre").toString());
                    data.putString("email",intent.getStringExtra("email").toString());
                }
            }
       }

        fragment.arguments=data;
        val fragmentManager = supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentcontainer,fragment)
        fragmentTransaction.commit()
    }
}