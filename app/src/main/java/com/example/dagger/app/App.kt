package com.example.dagger.app

import android.app.Application
import com.example.core.di.CoreComponent
import com.example.core.di.CoreModule
import com.example.core.di.DaggerCoreComponent
import com.example.feature.di.FeatureComponent
import com.example.feature.di.FeatureModule

class App : Application() {

    val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.builder()
            .coreModule(CoreModule())
            .build()
    }

//    val featureComponent: FeatureComponent by lazy {
//        DaggerFeatureComponent.builder()
//            .coreComponent(coreComponent)
//            .featureModule(FeatureModule())
//            .build()
//    }

}