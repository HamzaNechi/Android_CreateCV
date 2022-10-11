package com.example.cv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.slider.Slider

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        //getting  from first page
        val nom:String =intent.getStringExtra("nom").toString();
        val email:String=intent.getStringExtra("email").toString();
        val age:String=intent.getStringExtra("age").toString();
        val genre:String = intent.getStringExtra("genre").toString();
        //getting from this page
        val android:Slider=findViewById(R.id.android);
        val ios:Slider=findViewById(R.id.ios);
        val flutter:Slider=findViewById(R.id.flutter);
        val ar:CheckBox=findViewById(R.id.ar);
        val fr:CheckBox=findViewById(R.id.fr);
        val eng:CheckBox=findViewById(R.id.eng);
        val music:CheckBox=findViewById(R.id.music);
        val sport:CheckBox=findViewById(R.id.sport);
        val games:CheckBox=findViewById(R.id.games);
        val btnS: Button = findViewById(R.id.btnSubmit);

        btnS.setOnClickListener{
            val i=Intent(this,ResultActivity::class.java);
            i.putExtra("android",android.value.toString());
            if(ar.isChecked){
                i.putExtra("ar","Arabe");
            }
            if(fr.isChecked){
                i.putExtra("fr","Frensh");
            }
            if(eng.isChecked){
                i.putExtra("eng","English");
            }

            if(music.isChecked){
                i.putExtra("music","Music");
            }
            if(sport.isChecked){
                i.putExtra("sport","Sport");
            }
            if(games.isChecked){
                i.putExtra("game","Games");
            }

            startActivity(i);
        }
    }
}