package com.abhi.data

import com.abhi.domain.Repository

class KoinRideRepository(private val dataStoreFactory: DataStoreFactory) : Repository {

    override fun getHelloWorld(): String {
        return "Hello World!"
    }
}