package com.hegaro.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class AuthModel(
    val email:String,
    val password:String
    )


data class AuthResponseModel(
    val ok:Boolean,
    val user:UserModel?,
    val token:String
    )