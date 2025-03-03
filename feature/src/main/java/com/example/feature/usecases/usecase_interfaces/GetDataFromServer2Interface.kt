package com.example.feature.usecases.usecase_interfaces

interface GetDataFromServer2Interface {
    suspend operator fun invoke(): String
}