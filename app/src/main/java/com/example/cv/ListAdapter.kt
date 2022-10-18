package com.example.cv

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(private val context:Activity,private val arraylist:ArrayList<Company>) : ArrayAdapter<Company>(context,R.layout.list_item,arraylist){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater:LayoutInflater=LayoutInflater.from(context);
        val view:View=inflater.inflate(R.layout.list_item,null);

        val img=view.findViewById<ImageView>(R.id.img_company);
        val name=view.findViewById<TextView>(R.id.company_name);
        val start=view.findViewById<TextView>(R.id.startDate);
        val end=view.findViewById<TextView>(R.id.endDate);
        val adress=view.findViewById<TextView>(R.id.address);

        img.setImageResource(arraylist[position].image);
        name.text=arraylist[position].name;
        start.text=arraylist[position].start;
        end.text=arraylist[position].end;
        adress.text=arraylist[position].adress;
        return view;
    }
}