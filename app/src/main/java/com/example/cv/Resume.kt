package com.example.cv

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Resume : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)

        val nom=findViewById<TextView>(R.id.name);
        val x:String=intent.getStringExtra("name").toString();
        nom.text=x;
        val email=findViewById<TextView>(R.id.email);
        email.text=intent.getStringExtra("email").toString();
        val age=findViewById<TextView>(R.id.age);
        age.text=intent.getStringExtra("age").toString();
        val genre=findViewById<TextView>(R.id.genre);
        genre.text=intent.getStringExtra("genre").toString();
        val hobbies=findViewById<TextView>(R.id.hobbies);
        hobbies.text=intent.getStringExtra("hobbies").toString();
        val skills=findViewById<TextView>(R.id.skills);
        skills.text=intent.getStringExtra("skills").toString();
        val language=findViewById<TextView>(R.id.language);
        language.text=intent.getStringExtra("language").toString();

    }
}