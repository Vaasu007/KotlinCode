package com.example

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_two)
        setupViews()
    }

    private fun setupViews(){
        findViewById<TextView>(R.id.one_button).setOnClickListener(View.OnClickListener { v ->  replaceFragment(
            FragmentOne() as Fragment
        ) })


        findViewById<TextView>(R.id.two_button).setOnClickListener(View.OnClickListener { v ->  replaceFragment(
            FragmentTwo() as Fragment
        ) })
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.right_hand_side_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}