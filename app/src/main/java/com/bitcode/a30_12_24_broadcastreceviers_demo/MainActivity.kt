package com.bitcode.a30_12_24_broadcastreceviers_demo

import android.app.Notification.Action
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.a30_12_24_broadcastreceviers_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var myBroadcastReceiver: MyBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.registerReceiver.setOnClickListener(MyRegisterBtnClickListener())

        activityMainBinding.unregisterReceiver.setOnClickListener{
            unregisterReceiver(myBroadcastReceiver)
        }
    }

    inner class MyRegisterBtnClickListener : View.OnClickListener{
        override fun onClick(p0: View?) {
            myBroadcastReceiver = MyBroadcastReceiver()
            var intentFilter = IntentFilter(Intent.ACTION_BATTERY_LOW)
            registerReceiver(myBroadcastReceiver,intentFilter)
        }
    }
}