package com.example.feature.di

import androidx.fragment.app.Fragment
import com.example.core.di.CoreComponent
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer1Interface
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer2Interface
import dagger.Component

@Component(
    dependencies = [CoreComponent::class],
    modules = [FeatureModule::class]
)
interface FeatureComponent {
    fun inject(fragment: Fragment)
    fun getDataFromServer1UseCase(): GetDataFromServer1Interface
    fun getDataFromServer2UseCase(): GetDataFromServer2Interface
}