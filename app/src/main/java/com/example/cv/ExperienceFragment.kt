package com.example.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExperienceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_experience, container, false);
        val recycler=view.findViewById<RecyclerView>(R.id.recyclerview);
        recycler.layoutManager=LinearLayoutManager(this.context?.let { it},RecyclerView.VERTICAL,false);

        val c1:Company=Company(start = "01/09/2020", end = "Today",name="Amazon", adress = "United States", image = R.drawable.ic_logo_amazon);
        val c2:Company=Company(start = "01/09/2018", end = "31/08/2022",name="Facebook", adress = "France", image = R.drawable.ic_logo_facebook);
        val c3:Company=Company(start = "01/09/2016", end = "31/08/2020",name="Microsoft", adress = "United States", image = R.drawable.ic_logo_microsoft);
        val c4:Company=Company(start = "01/09/2014", end = "31/08/2018",name="Esprit", adress = "Tunis", image = R.drawable.ic_logo_esprit);
        val companyArrayList=ArrayList<Company>();
        companyArrayList.add(c1);
        companyArrayList.add(c2);
        companyArrayList.add(c3);
        companyArrayList.add(c4);

        recycler.adapter=RecyclerAdapter(companyArrayList);
        return view;
    }
}