package com.example.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

//we extend from the service class in the android.app
// we wont implement active services , we will just do troubleshooting
//similar to what we did in the activity lifecycle and Fragment lectures
class ClassicServiceExample : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Service","Classic service is Created. ")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("Service","Classic service is started. ")
        Log.d("Service Thread",Thread.currentThread().name)

        //this line stops the service automatically after it was started and completed e.g for a download service
        // stopSelf()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service","Classic service is destroyed. ")

    }
}