package com.example.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ResumeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =inflater.inflate(R.layout.fragment_resume, container, false);

        val nom=view.findViewById<TextView>(R.id.nom_resume);
        val age=view.findViewById<TextView>(R.id.years);
        val genre=view.findViewById<TextView>(R.id.gender);
        val email=view.findViewById<TextView>(R.id.mail);

        val data=arguments;

        if(data != null){
            nom.text=data.getString("nom");
            age.text=data.getString("age");
            genre.text=data.getString("genre");
            email.text=data.getString("email")
        }
        return view;
    }
}