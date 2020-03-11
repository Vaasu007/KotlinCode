package com.example

import android.content.Context
import android.view.View
import android.widget.ListAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter as ArrayAdapter1


open class MyArrayAdapter : AppCompatActivity() {



    var myStringArray = ArrayList<String>()

    private val ll: Model? = null

    var x = ll?.getModel(myStringArray)

    var p = x as ArrayList<String>

    private val layoutID = android.R.layout.simple_list_item_1

    fun getAdapter(): ArrayAdapter1<String>{

       val  myAdapterInstance =
           ArrayAdapter1<String>(this, layoutID, p );

       return myAdapterInstance
    }

}

