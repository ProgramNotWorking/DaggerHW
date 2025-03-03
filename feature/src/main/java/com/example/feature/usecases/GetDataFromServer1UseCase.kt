package com.example.feature.usecases

import com.example.feature.repository.NetworkRepositoryImpl
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer1Interface
import javax.inject.Inject

class GetDataFromServer1UseCase @Inject constructor(
    private val repository: NetworkRepositoryImpl
): GetDataFromServer1Interface {
    override suspend fun invoke(): String {
        return repository.fetchDataFromServer1()
    }
}