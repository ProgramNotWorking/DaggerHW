package com.example.core.di

import com.example.core.api_service.ApiService1
import com.example.core.api_service.ApiService2
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class CoreModule {

    @Provides
    fun provideApiService1(): ApiService1 {
        val retrofit = Retrofit.Builder()
            .baseUrl(CoreDiConstants.BASE_URL1)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiService1::class.java)
    }

    @Provides
    fun provideApiService2(): ApiService2 {
        val retrofit = Retrofit.Builder()
            .baseUrl(CoreDiConstants.BASE_URL2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiService2::class.java)
    }

}