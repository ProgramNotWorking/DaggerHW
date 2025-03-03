package com.example.feature.di.annotations

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FromServer1

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FromServer2