package com.hegaro.mvvm.core
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    //private const val URL = "https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/"
    private const val URL = "https://api.hegaro.com.bo"
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}