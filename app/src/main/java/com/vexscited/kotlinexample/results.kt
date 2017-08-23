package com.vexscited.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_results.*

class results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        //populate our fields from intent
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val sportSelected = intent.getStringExtra("sport")

        val finalString = "You're named $name, having $age yo.\nYou're favourite sport is $sportSelected\n TA-DA !! 😁🤓💪"

        resultLabel.text = finalString
    }
}
