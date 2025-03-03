package com.example.feature.usecases

import com.example.feature.repository.NetworkRepositoryImpl
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer2Interface
import javax.inject.Inject

class GetDataFromServer2UseCase @Inject constructor(
    private val repository: NetworkRepositoryImpl
): GetDataFromServer2Interface {
    override suspend fun invoke(): String {
        return repository.fetchDataFromServer2()
    }
}