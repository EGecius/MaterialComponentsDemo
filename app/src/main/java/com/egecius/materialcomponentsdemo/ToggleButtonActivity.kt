@file:SuppressLint("LongLogTag")

package com.egecius.materialcomponentsdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        addButtonsProgrammatically()
        setClickListener()
    }

    private fun setClickListener() {
        toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->
            if (isChecked) {
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
                        Log.v(
                            "Eg:ToggleButtonActivity:38",
                            "setClickListener() toggleButton.checkedButtonId: ${toggleButton.checkedButtonId}"
                        )
                        val view = toggleButton.findViewById(toggleButton.checkedButtonId) as Button
                        Log.d("Eg:ToggleButtonActivity:40", "setClickListener() view.text: ${view.text}")
                    }
                }
            }
        }
    }

    private fun addButtonsProgrammatically() {
        val button = layoutInflater.inflate(R.layout.button, root_view, false) as Button
        button.text = "set programmatically"
        toggleButton.addView(button)
    }

}