package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MyAdapter (private val context :Activity,private val arrayList: ArrayList<Product>) : ArrayAdapter<Product>(context,
                    R.layout.list_item,arrayList)    {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null);

        val imageview : ImageView = view.findViewById(R.id.profile_pic)
        val name : TextView = view.findViewById(R.id.personalName)
        val description : TextView = view.findViewById(R.id.description)
        val price : TextView = view.findViewById(R.id.price)

        imageview.setImageResource(arrayList[position].imageId)
        name.text = arrayList[position].name
        price.text = arrayList[position].price
        description.text = arrayList[position].description







        return view
    }


}