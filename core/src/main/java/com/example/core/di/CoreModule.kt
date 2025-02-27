package com.example.core.di

import com.example.core.api_service.ApiService1
import com.example.core.api_service.ApiService2
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named

@Module
class CoreModule {

    @Provides
    @Named(CoreDiConstants.SERVER1)
    fun provideRetrofitServer1(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(CoreDiConstants.BASE_URL1)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Named(CoreDiConstants.SERVER2)
    fun provideRetrofitServer2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(CoreDiConstants.BASE_URL2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideApiService1(@Named(CoreDiConstants.SERVER1) retrofit: Retrofit): ApiService1 {
        return retrofit.create(ApiService1::class.java)
    }

    @Provides
    fun provideApiService2(@Named(CoreDiConstants.SERVER2) retrofit: Retrofit): ApiService2 {
        return retrofit.create(ApiService2::class.java)
    }

}