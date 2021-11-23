package com.dicoding.latihan_background_process_dan_networking_3

import android.app.Activity
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat

object PermissionManager {
    fun check(activity: Activity, permission: String, requestCode: Int) {
        if (ActivityCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, arrayOf(permission), requestCode)
        } else {
            Toast.makeText(activity, "Sms receiver permission diterima", Toast.LENGTH_SHORT).show()
        }
    }
}