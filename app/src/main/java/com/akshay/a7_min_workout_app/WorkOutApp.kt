package com.akshay.a7_min_workout_app

import android.app.Application

class WorkOutApp : Application() {

    val db by lazy {
        HistoryDatabase.getInstance(this)
    }

}