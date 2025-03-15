package com.bitcode.a30_12_24_broadcastreceviers_demo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            if (intent.action!! == Intent.ACTION_AIRPLANE_MODE_CHANGED){
                if (intent.getBooleanExtra("state", true)){
                    Toast.makeText(context,"Air plane mode change ", Toast.LENGTH_LONG).show()
                }
            }

            if (intent.action == Intent.ACTION_BATTERY_LOW){
                if (intent.getBooleanExtra("state", true)){
                    Toast.makeText(context,"Battery Low", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}