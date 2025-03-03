package com.example.dagger.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer1Interface
import com.example.feature.usecases.usecase_interfaces.GetDataFromServer2Interface
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.launch
import javax.inject.Provider

class MainViewModel @AssistedInject constructor(
    @Assisted private val useCase1: GetDataFromServer1Interface,
    @Assisted private val useCase2: GetDataFromServer2Interface
) : ViewModel() {

    @AssistedFactory
    interface Factory {
        fun create(
            @Assisted useCase1: GetDataFromServer1Interface,
            @Assisted useCase2: GetDataFromServer2Interface
        ): MainViewModel
    }

    class MainViewModelFactory @AssistedInject constructor(
        @Assisted private val useCase1: GetDataFromServer1Interface,
        @Assisted private val useCase2: GetDataFromServer2Interface,
        private val mainViewModelProvider: Provider<MainViewModel.Factory>
    ) : ViewModelProvider.Factory {

        @AssistedFactory
        interface Factory {
            fun create(
                @Assisted useCase1: GetDataFromServer1Interface,
                @Assisted useCase2: GetDataFromServer2Interface
            ): MainViewModelFactory
        }

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when (modelClass) {
                MainViewModel::class.java -> mainViewModelProvider.get().create(
                    useCase1, useCase2
                )

                else -> throw IllegalArgumentException(
                    "Create ViewModel Error for ${modelClass.name}. " +
                            "ModelClass must be MainViewModel"
                )
            } as T
        }

    }

    fun logDataFromServer() {
        viewModelScope.launch {
            Log.d("TEST", useCase1())
            Log.d("TEST", useCase2())
        }
    }

}