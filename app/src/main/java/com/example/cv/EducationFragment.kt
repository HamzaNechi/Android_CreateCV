package com.example.cv

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class EducationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_education, container, false);
        val list=view.findViewById<ListView>(R.id.listview);
        val c1:Company=Company(start = "01/09/2020", end = "Today",name="Massachussette", adress = "United States", image = R.drawable.ic_logo_massachusetts);
        val c2:Company=Company(start = "01/09/2018", end = "31/08/2022",name="OxFord", adress = "United King Dom", image = R.drawable.ic_logo_oxford);
        val c3:Company=Company(start = "01/09/2016", end = "31/08/2020",name="Stan ford", adress = "United States", image = R.drawable.ic_logo_stanford);
        val c4:Company=Company(start = "01/09/2014", end = "31/08/2018",name="Cambdridge", adress = "United States", image = R.drawable.ic_logo_cambridge);
        val companyArrayList=ArrayList<Company>();
        companyArrayList.add(c1);
        companyArrayList.add(c2);
        companyArrayList.add(c3);
        companyArrayList.add(c4);
        list.adapter= this.context?.let { ListAdapter(it,companyArrayList) };

        return view;
    }
}

