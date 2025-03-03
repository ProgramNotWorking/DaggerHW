package com.example.feature.repository

interface NetworkRepository {
    suspend fun getDataFromServer(): String
}