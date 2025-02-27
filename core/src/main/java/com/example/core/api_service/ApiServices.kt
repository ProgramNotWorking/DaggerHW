package com.example.core.api_service

import retrofit2.http.GET

interface ApiService1 {
    @GET("fakeEndpointOne")
    suspend fun request1(): String
}

interface ApiService2 {
    @GET("fakeEndpointTwo")
    suspend fun request2(): String
}