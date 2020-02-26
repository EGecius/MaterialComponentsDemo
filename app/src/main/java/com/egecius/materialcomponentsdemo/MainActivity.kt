package com.egecius.materialcomponentsdemo

import android.app.DownloadManager
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

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

    fun showSnackbar(view: View) {
        Snackbar.make(root_view, getString(R.string.download_saved_msg), 7000)
            .setAction(getString(R.string.downloads)) {
                startActivity(Intent(DownloadManager.ACTION_VIEW_DOWNLOADS))
            }
            .show()
    }
}
