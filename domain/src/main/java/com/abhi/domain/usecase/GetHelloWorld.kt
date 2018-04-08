package com.abhi.domain.usecase

import com.abhi.domain.Repository

class GetHelloWorld(private val repository: Repository) {

    init {
        println("init ${this.javaClass.simpleName}")
    }

    fun getMessage() = repository.getHelloWorld()
}