package com.example.spinner_with_coustomadapter_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter : ArrayAdapter<SpinnerItem>{

    private var CustomSpinnerItems : List<SpinnerItem>

    constructor(context: Context, resource: Int, pickerItems: List<SpinnerItem>) : super(
        context,
        resource,
        pickerItems
    ){this.CustomSpinnerItems = pickerItems}

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return CustomSpinnerView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return CustomSpinnerView(position, convertView, parent)
    }
    private fun CustomSpinnerView(position: Int, convertView: View?, parent: ViewGroup) : View{
        //Getting the Layout
        val customView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_item_layout, parent, false)
        // Declaring and initalizing the imageview and textview
        val imageView = customView.findViewById<ImageView>(R.id.flagIcon)
        val textView = customView.findViewById<TextView>(R.id.Text)


        imageView.setImageResource(CustomSpinnerItems[position].image)
        textView.setText(CustomSpinnerItems[position].name)
        return customView
    }


}




















































