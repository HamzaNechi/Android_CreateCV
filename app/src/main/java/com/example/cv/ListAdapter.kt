package com.example.cv

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(var context: Context, arrayList: ArrayList<Company>): BaseAdapter(){
    var my_context: Context;
    var arraylist:ArrayList<Company>
    init {
        my_context=context;
        arraylist=arrayList;
    }
    override fun getCount(): Int {
        return arraylist.size;
    }

    override fun getItem(p0: Int): Any {
        return p0.toLong();
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater:LayoutInflater=LayoutInflater.from(my_context);
        val view:View=inflater.inflate(R.layout.list_item,null);

        val img=view.findViewById<ImageView>(R.id.img_company);
        val name=view.findViewById<TextView>(R.id.company_name);
        val start=view.findViewById<TextView>(R.id.startDate);
        val end=view.findViewById<TextView>(R.id.endDate);
        val adress=view.findViewById<TextView>(R.id.address);

        img.setImageResource(arraylist[p0].image);
        name.text=arraylist[p0].name;
        start.text=arraylist[p0].start;
        end.text=arraylist[p0].end;
        adress.text=arraylist[p0].adress;
        return view;
    }

}