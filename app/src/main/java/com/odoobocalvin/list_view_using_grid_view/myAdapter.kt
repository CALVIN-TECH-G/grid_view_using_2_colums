package com.odoobocalvin.list_view_using_grid_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class myAdapter (val context: Context, val list: ArrayList<grid_view_item>):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
       return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.gridlayout, null)


        val name = view.findViewById<TextView>(R.id.textV1)
        val details = view.findViewById<TextView>(R.id.textV3)
        val image = view.findViewById<ImageView>(R.id.image)

        name.text = list[p0].name
        details.text = list[p0].details
        image.setImageResource(list[p0].image)

        return view

    }
}
