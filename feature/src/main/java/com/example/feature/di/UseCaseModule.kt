package com.example.feature.di

import com.example.feature.usecases.GetDataFromServer1UseCase
import com.example.feature.usecases.GetDataFromServer2UseCase
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer1Interface
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer2Interface
import dagger.Binds
import dagger.Module

@Module
interface UseCaseModule {

    @Binds
    fun bindGetDataFromServer1UseCase(
        useCase: GetDataFromServer1UseCase
    ): GetDataFromServer1Interface

    @Binds
    fun bindGetDataFromServer2UseCase(
        useCase: GetDataFromServer2UseCase
    ): GetDataFromServer2Interface

}