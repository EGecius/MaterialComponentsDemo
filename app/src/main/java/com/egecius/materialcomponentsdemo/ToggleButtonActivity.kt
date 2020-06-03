@file:SuppressLint("LongLogTag")

package com.egecius.materialcomponentsdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        setClickListener()
    }

    private fun setClickListener() {
        toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->

            when (checkedId) {
                R.id.button1 -> {
                    Log.v("Eg:ToggleButtonActivity:21", "setClickListener() clicked button1")
                }
                R.id.button2 -> {
                    Log.v("Eg:ToggleButtonActivity:24", "setClickListener() clicked button2")
                }
                R.id.button3 -> {
                    Log.v("Eg:ToggleButtonActivity:27", "setClickListener() clicked button3")
                }
                else -> {
                    Log.v("Eg:ToggleButtonActivity:23", "setClickListener() another button clicked")
                }
            }
            // Respond to button selection
        }
    }
}