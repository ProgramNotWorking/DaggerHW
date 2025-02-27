package com.example.feature.usecases

import com.example.feature.repository.NetworkRepositoryImpl
import javax.inject.Inject

class GetDataFromServer1UseCase @Inject constructor(
    private val repository: NetworkRepositoryImpl
) {
    suspend operator fun invoke(): String {
        return repository.fetchDataFromServer1()
    }
}