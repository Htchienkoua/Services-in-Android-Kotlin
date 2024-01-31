package com.example.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

//the workmanager service is more updated than the JobIntentService especially for android jetpack
class JobIntentServiceExample : JobIntentService() {

    override fun onHandleWork(intent: Intent) {
        Log.d("Service", "Job Intent service is Started.")
        Log.d("Service Thread",Thread.currentThread().name)
    }

    companion object{
        fun myBackgroundService(context : Context, intent : Intent){
            enqueueWork(context, JobIntentServiceExample::class.java, 1, intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service", "Job intent service is Stopped.")
    }

}