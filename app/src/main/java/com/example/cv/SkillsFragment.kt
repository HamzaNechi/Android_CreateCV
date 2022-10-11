package com.example.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.slider.Slider


class SkillsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_skills, container, false)
        val android_sl=view.findViewById<Slider>(R.id.android);
        val ios_sl=view.findViewById<Slider>(R.id.ios);
        val flutter_sl=view.findViewById<Slider>(R.id.flutter);
        val data=arguments;
        if(data != null){
            val android = data.getString("android");
            if(android != null)
                android_sl.value=android.toFloat();

            val ios = data.getString("ios");
            if(ios != null)
                ios_sl.value=ios.toFloat();

            val flutter = data.getString("flutter");
            if(flutter != null)
                flutter_sl.value=flutter.toFloat();
        }
        return view;
    }
}