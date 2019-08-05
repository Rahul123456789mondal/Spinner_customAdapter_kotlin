package com.example.spinner_with_coustomadapter_kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get

class MainActivity : AppCompatActivity() {


    @SuppressLint("LongLogTag")
    lateinit var countryName : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner : Spinner = findViewById(R.id.country_spinner)
        val countryData = Data.DataSource
        Log.d("data Store", countryData.toString())
        Log.i("Data Sourse", "Data Are Store In The Spinner")

        val adapter = CustomAdapter(this@MainActivity, R.layout.spinner_item_layout, countryData)
        spinner.adapter = adapter
        Log.i("Adapter", "Adapter Is Loaded")
        spinner.setSelection(0)
        countryName = countryData.get(0).name!!
        // Toast.makeText(this@MainActivity, "You Selected $countryName", Toast.LENGTH_SHORT).show()
        // Calling the spinner using the method onItemSelectLisener
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(adapterView : AdapterView<*>?) {

            }

            override fun onItemSelected(adapterView : AdapterView<*>?, view: View?, position: Int, Id: Long) {
                //spinner.get(position)
                val clickItem = adapterView?.getItemAtPosition(position)
                countryName = countryData.get(position).name!!

                Toast.makeText(this@MainActivity, "You selected $countryName", Toast.LENGTH_SHORT).show()
            }

        }



    }
}
