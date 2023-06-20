package com.hegaro.mvvm.data.model

data class ErrorModel(
    val ok: Boolean,
    val err:Err
)
data class Err(
    val message:String
)