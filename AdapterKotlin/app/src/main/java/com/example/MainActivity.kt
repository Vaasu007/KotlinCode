package com.example

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView = findViewById<View>(R.id.my_list_view) as ListView

        var myStringArray = ArrayList<String>()

        val myAdaptable:MyArrayAdapter? = null

        val myAdapterInstance = myAdaptable?.getAdapter()

        myListView.adapter = myAdapterInstance



        myAdapterInstance?.notifyDataSetChanged()



    }
}
