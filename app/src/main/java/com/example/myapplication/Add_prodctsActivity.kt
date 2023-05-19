package com.example.myapplication

import android.content.Intent
import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityAddProdctsBinding

class Add_prodctsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddProdctsBinding
    private lateinit var productArrayList: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddProdctsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val description = intArrayOf(

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l

        )
        val name = arrayOf(
            "Hive",
            "Frames",
            "Smoker",
            "Hive Tool",
            "Queen Catcher",
            "Suit",
            "Gloves",
            "Shoes",
            "Oils",
            "Feeeders",
            "Queen Excuder",
            "Queen Maker",

            )
        val imageId = arrayOf(
            "Ksh.1000",
            "Ksh.6469 ",
            "Ksh.859 ",
            "Ksh.795 ",
            "Ksh.1000",
            "Ksh.6469 ",
            "Ksh.859 ",
            "Ksh.795 ",
            "Ksh.1000",
            "Ksh.6469 ",
            "Ksh.859 ",
            "Ksh.795 ",
        )
        val price = arrayOf(
            "Ksh.1000", "Ksh.6469 ", "Ksh.859 ", "Ksh.795 ",
            "Ksh.1000", "Ksh.6469 ", "Ksh.859 ", "Ksh.795 ",
            "Ksh.1000", "Ksh.6469 ", "Ksh.859 ", "Ksh.795 ",
        )

        productArrayList = ArrayList()

        for (i in name.indices) {
            val product = Product(name[i], description[i], price[i], imageId[i])
            productArrayList.add(product)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, productArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->
            val name = name[position]
            val price = price[position]
            val description = description[position]
            val imageId = imageId[position]
            val i = Intent(this, Pay_optionActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("price", price)
            i.putExtra("description", description)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }

    }


}

