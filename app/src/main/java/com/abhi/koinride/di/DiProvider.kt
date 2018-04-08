package com.abhi.koinride.di

import com.abhi.data.DataStoreFactory
import com.abhi.data.KoinRideRepository
import com.abhi.domain.Repository
import com.abhi.domain.usecase.GetHelloWorld
import com.abhi.koinride.MainViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext


val koinRideAppModule: Module = applicationContext {

    bean { DataStoreFactory(get()) }
    bean { KoinRideRepository(get()) as Repository }
}

val useCaseModule = applicationContext {

    factory { GetHelloWorld(get()) }
}

val viewModelModule = applicationContext {

    viewModel { MainViewModel(get()) }

}
