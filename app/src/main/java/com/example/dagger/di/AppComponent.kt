package com.example.dagger.di

import android.content.Context
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun context(): Context
}