package com.example.core.di

import com.example.core.api_service.ApiService1
import com.example.core.api_service.ApiService2
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Named

@Component(modules = [CoreModule::class])
interface CoreComponent {
    @Named(CoreDiConstants.SERVER1) fun retrofitServer1(): Retrofit
    @Named(CoreDiConstants.SERVER2) fun retrofitServer2(): Retrofit
    fun apiService1(): ApiService1
    fun apiService2(): ApiService2
}