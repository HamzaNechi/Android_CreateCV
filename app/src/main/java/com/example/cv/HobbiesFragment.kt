package com.example.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

class HobbiesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View =inflater.inflate(R.layout.fragment_hobbies, container, false);
        val sport=view.findViewById<CheckBox>(R.id.sport);
        val music=view.findViewById<CheckBox>(R.id.music);
        val game=view.findViewById<CheckBox>(R.id.games);

        val data =arguments;

        if(data != null){
            if(data.getString("sport")!=null){
                sport.isChecked=true;
            }

            if(data.getString("music")!=null){
                music.isChecked=true;
            }

            if(data.getString("game")!=null){
                game.isChecked=true;
            }

        }
        // Inflate the layout for this fragment
        return view;
    }
}