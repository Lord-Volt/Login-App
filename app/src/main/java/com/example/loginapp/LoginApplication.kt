package com.example.loginapp

import android.app.Application
import com.example.loginapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class LoginApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@LoginApplication)
            androidLogger()

            modules(appModule)
        }
    }
}