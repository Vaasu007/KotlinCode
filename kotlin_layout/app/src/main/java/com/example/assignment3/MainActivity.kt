package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearButton =
            findViewById<View>(R.id.linearButton) as Button
        val relativeButton =
            findViewById<View>(R.id.relativeButton) as Button
        val gridButton =
            findViewById<View>(R.id.gridbutton) as Button

        linearButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    LinearLayoutActivity::class.java
                )
            )
        }

        relativeButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    RelativeLayoutActivity::class.java
                )
            )
        }

        gridButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    GridLayoutActivity::class.java
                )
            )
        }
    }
}
