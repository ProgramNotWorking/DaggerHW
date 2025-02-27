package com.example.feature.repository

import com.example.core.api_service.ApiService1
import com.example.core.api_service.ApiService2
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val apiService1: ApiService1,
    private val apiService2: ApiService2
) {

    suspend fun fetchDataFromServer1(): String {
        apiService1.request1()
        return "Hello from 1"
    }

    suspend fun fetchDataFromServer2(): String {
        apiService2.request2()
        return "Hello from 2"
    }

}