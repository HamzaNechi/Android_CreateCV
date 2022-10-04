package com.example.cv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class FormActivity : AppCompatActivity() {
    val verif=false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val name=findViewById<EditText>(R.id.fullnameedit);
        val layout_name=findViewById<TextInputLayout>(R.id.fullname);

        val email=findViewById<EditText>(R.id.emailedit);
        val layout_email=findViewById<TextInputLayout>(R.id.email);

        val age = findViewById<EditText>(R.id.ageedit);
        val layout_age=findViewById<TextInputLayout>(R.id.age);

        val female=findViewById<RadioButton>(R.id.female);
        val male=findViewById<RadioButton>(R.id.male);
        val btnNext=findViewById<Button>(R.id.btnNext);

        btnNext.setOnClickListener{
            if(name.text.isEmpty()){
                name.error="Must not be empty !"
                layout_name.helperText=name.error
            }else{
                if(age.text.isEmpty()){
                    age.error="Must not be empty !"
                    layout_age.helperText=age.error;
                }else{
                    if(email.text.isEmpty()){
                        email.error="Must not be empty !";
                        layout_email.helperText=email.error;
                    }else{
                        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email.text).matches()){
                            email.error="Invalide Email";
                            layout_email.helperText=email.error;
                        }else{
                            val i=Intent(this,SkillsActivity::class.java);
                            startActivity(i);
                        }
                    }
                }
            }
        }

    }
}