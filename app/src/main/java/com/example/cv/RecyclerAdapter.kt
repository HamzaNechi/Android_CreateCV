package com.example.cv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val listCompany:ArrayList<Company>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false);
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data:Company=listCompany[position];
        holder.name.text=data.name;
        holder.adress.text=data.adress;
        holder.start.text=data.start;
        holder.end.text=data.end;
        holder.constraint_layout.setBackgroundResource(data.image);
    }

    override fun getItemCount(): Int {
        return listCompany.size;
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val constraint_layout=view.findViewById<ConstraintLayout>(R.id.constraint_layout);
        val name=view.findViewById<TextView>(R.id.name_university);
        val adress=view.findViewById<TextView>(R.id.adress_university);
        val start=view.findViewById<TextView>(R.id.start_university);
        val end=view.findViewById<TextView>(R.id.end_university);
    }
}