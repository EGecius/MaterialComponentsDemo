package com.egecius.materialcomponentsdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showAlertDialog(view: View) {
        AlertDialog.Builder(this)
            .setMessage(R.string.csv_download_confirmation)
            .setPositiveButton(R.string.ok) { _, _ ->
                // no
            }
            .setNegativeButton(R.string.cancel) { dialog, _ ->
                dialog.cancel()
            }.show()
    }
}
