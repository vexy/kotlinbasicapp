package com.vexscited.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateSportsSpinner()
    }

    fun populateSportsSpinner() {
        //load all sports from resource:
        val arrayID = R.array.sports
        val spinnerArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, resources.getStringArray(arrayID))

        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sportsList.adapter = spinnerArrayAdapter
    }
}
