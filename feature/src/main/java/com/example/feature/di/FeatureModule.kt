package com.example.feature.di

import com.example.core.api_service.ApiService1
import com.example.core.api_service.ApiService2
import com.example.feature.repository.NetworkRepositoryImpl
import com.example.feature.usecases.GetDataFromServer1UseCase
import com.example.feature.usecases.GetDataFromServer2UseCase
import dagger.Module
import dagger.Provides

@Module
class FeatureModule {

    @Provides
    fun provideNetworkRepository(
        apiService1: ApiService1,
        apiService2: ApiService2
    ): NetworkRepositoryImpl {
        return NetworkRepositoryImpl(apiService1, apiService2)
    }

    @Provides
    fun provideGetDataFromServer1UseCase(
        repository: NetworkRepositoryImpl
    ): GetDataFromServer1UseCase {
        return GetDataFromServer1UseCase(repository)
    }

    @Provides
    fun provideGetDataFromServer2UseCase(
        repository: NetworkRepositoryImpl
    ): GetDataFromServer2UseCase {
        return GetDataFromServer2UseCase(repository)
    }

}