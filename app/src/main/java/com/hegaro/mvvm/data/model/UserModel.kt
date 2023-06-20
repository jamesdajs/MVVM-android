package com.hegaro.mvvm.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel(
    val state : Boolean,
    val role : String,
    val facebook:Boolean,
    val google: Boolean,
    val devicetoken : Array<String>,
    val verified: Boolean,
    val _id:String,
    val email:String,
    val username:String,
    val age:Int,
    val avatar:String,
    val avatarname:String,
    val date:String,
    val fullname:String,
    val gender:String,
    val code:String,
    val phone:String,
    val height : Int,
    val weight:Int
):  Parcelable
