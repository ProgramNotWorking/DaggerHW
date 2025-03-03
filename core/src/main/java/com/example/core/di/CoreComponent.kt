package com.example.core.di

import com.example.core.api_service.ApiService1
import com.example.core.api_service.ApiService2
import dagger.Component

@Component(modules = [CoreModule::class])
interface CoreComponent {
    fun apiService1(): ApiService1
    fun apiService2(): ApiService2
}