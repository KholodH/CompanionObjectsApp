package com.example.companionobjectsapp

import android.view.View

class DayOrNight {
    companion object nam {


        val night = 0
        val day = 1


        fun changeBackground(layout: View, day: Int) {

            when (day) {
                0 -> {
                    layout.setBackgroundResource(R.drawable.night)
                }
                1 -> {
                    layout.setBackgroundResource(R.drawable.day)
                }
            }
        }
    }
}