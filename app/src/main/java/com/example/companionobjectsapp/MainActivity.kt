package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(Cons.MAIN_TAG, "onCreate: ")

        val dayOrNightLayout = findViewById<ConstraintLayout>(R.id.layout)
        val etDayOrNight = findViewById<EditText>(R.id.tv1)
        val btnChangeBG = findViewById<Button>(R.id.button)
        val tvDayOrNight = findViewById<TextView>(R.id.tv2)



        val name = DayOrNight.nam
        btnChangeBG.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var dayOrNightStr = etDayOrNight.text?.toString()
                when(dayOrNightStr?.toLowerCase()){

                    "day"->{
                        DayOrNight.changeBackground(dayOrNightLayout,1)
                        etDayOrNight.setTextColor(Color.BLACK)
                        tvDayOrNight.setTextColor(Color.BLACK)
                    }
                    "night"->{
                        DayOrNight.changeBackground(dayOrNightLayout,0)
                        etDayOrNight.setTextColor(Color.WHITE)
                        tvDayOrNight.setTextColor(Color.WHITE)
                    }
                }
            }

        })
    }
}