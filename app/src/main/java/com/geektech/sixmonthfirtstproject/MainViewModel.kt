package com.geektech.sixmonthfirtstproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    private var mCounter=0
    private var mHistory=""

    var history=MutableLiveData<String>()
    val counter= MutableLiveData<Int>()

    fun onIncrementClick(){
        mCounter++
        counter.value=mCounter
        mHistory="$mHistory\n+"
    }
    fun onDecrementClick(){
        mCounter--
        counter.value=mCounter
        mHistory="$mHistory\n-"
        history.value=mHistory
    }
}