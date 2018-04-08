package com.abhi.koinride

import android.app.Application
import com.abhi.koinride.di.koinRideAppModule
import com.abhi.koinride.di.useCaseModule
import com.abhi.koinride.di.viewModelModule
import org.koin.android.ext.android.startKoin

class KoinRideApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(koinRideAppModule, useCaseModule, viewModelModule))

    }
}