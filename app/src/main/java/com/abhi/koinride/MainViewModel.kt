package com.abhi.koinride

import com.abhi.domain.usecase.GetHelloWorld
import com.abhi.koinride.base.BaseViewModel

class MainViewModel(private val getHelloWorld: GetHelloWorld) : BaseViewModel() {


    fun getTheSwag() = getHelloWorld.getMessage()
}