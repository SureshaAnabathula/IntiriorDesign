package com.suresh.interiordesigning

import android.app.Application
import com.google.firebase.FirebaseApp

class FireApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}