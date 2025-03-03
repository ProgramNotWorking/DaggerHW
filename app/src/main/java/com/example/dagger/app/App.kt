package com.example.dagger.app

import android.app.Application
import com.example.core.di.CoreComponent
import com.example.core.di.DaggerCoreComponent
import com.example.dagger.di.AppComponent
import com.example.dagger.di.AppModule
import com.example.dagger.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent
    lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

        coreComponent = DaggerCoreComponent.create()
    }

}