package com.hegaro.mvvm.network

import com.hegaro.mvvm.data.model.AuthModel
import com.hegaro.mvvm.data.model.AuthResponseModel
import retrofit2.Response
import retrofit2.http.Body

import retrofit2.http.GET
import retrofit2.http.POST

interface AuthHandler {
    @POST("/user/login")
    suspend fun loginUser(
        @Body requestBody: AuthModel
    ):Response<AuthResponseModel>

}