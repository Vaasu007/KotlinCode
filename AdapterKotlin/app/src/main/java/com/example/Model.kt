package com.example

import java.util.ArrayList


class Model  {

    fun getModel(myStringArray:ArrayList<String>):ArrayList<String> {

        myStringArray.add("The");
        myStringArray.add("quick");
        myStringArray.add("green");
        myStringArray.add("Android");
        myStringArray.add("jumped");
        myStringArray.add("over");
        myStringArray.add("the");
        myStringArray.add("lazy");

        return myStringArray
    }
}