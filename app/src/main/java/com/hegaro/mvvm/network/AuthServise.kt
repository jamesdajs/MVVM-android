package com.hegaro.mvvm.network

import com.hegaro.mvvm.core.RetrofitHelper
import com.hegaro.mvvm.data.model.AuthModel
import com.hegaro.mvvm.data.model.AuthResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthServise {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun login(authModel: AuthModel): AuthResponseModel {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(AuthHandler::class.java).loginUser(authModel)

                response.body()?: AuthResponseModel(ok = false,user = null,token = "")

        }
    }
}