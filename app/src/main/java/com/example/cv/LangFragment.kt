package com.example.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox


class LangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_lang, container, false);
        val arabe=view.findViewById<CheckBox>(R.id.ar);
        val francais=view.findViewById<CheckBox>(R.id.fr);
        val anglais=view.findViewById<CheckBox>(R.id.eng);

        val data=arguments;

        if(data != null){
            if(data.getString("ar")!=null){
                arabe.isChecked=true;
            }

            if(data.getString("fr")!=null){
                francais.isChecked=true;
            }

            if(data.getString("eng")!=null){
                anglais.isChecked=true;
            }
        }
        return view;
    }
}