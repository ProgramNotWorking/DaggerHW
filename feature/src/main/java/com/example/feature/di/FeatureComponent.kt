package com.example.feature.di

import android.app.Activity
import com.example.core.di.CoreComponent
import com.example.feature.usecases.GetDataFromServer1UseCase
import com.example.feature.usecases.GetDataFromServer2UseCase
import dagger.Component

@Component(
    dependencies = [CoreComponent::class],
    modules = [FeatureModule::class]
)
interface FeatureComponent {
    fun inject(activity: Activity)
    fun getDataFromServer1(): GetDataFromServer1UseCase
    fun getDataFromServer2(): GetDataFromServer2UseCase
}