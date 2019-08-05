package com.example.spinner_with_coustomadapter_kotlin

internal class Data {
    companion object{
        val DataSource : List<SpinnerItem> = object : ArrayList<SpinnerItem>(){
            init {
                add(SpinnerItem("New Zeland", R.drawable.nz))
                add(SpinnerItem("Portugal", R.drawable.pt))
                add(SpinnerItem("SriLanka", R.drawable.lk))
                add(SpinnerItem("Naigeria", R.drawable.ng))
                add(SpinnerItem("Nepal", R.drawable.np))
                add(SpinnerItem("Swiden", R.drawable.se))
                add(SpinnerItem("USA", R.drawable.us))
                add(SpinnerItem("New Zeland", R.drawable.uy))
                add(SpinnerItem("New Zeland", R.drawable.za))
                add(SpinnerItem("New Zeland", R.drawable.zw))

            }
        }
    }
}