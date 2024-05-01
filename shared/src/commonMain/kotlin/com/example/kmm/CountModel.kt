package com.example.kmm

class CountModel(var count:Int=0) {
    fun increment(){
        count++
    }
    fun decrement(){
        if (count>0){
            count--
        }
    }
}