package com.hegaro.mvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hegaro.mvvm.data.model.AuthModel
import com.hegaro.mvvm.data.model.AuthResponseModel
import com.hegaro.mvvm.network.AuthServise
import kotlinx.coroutines.launch

class AuthViewModel:ViewModel() {
    //val authModel = MutableLiveData<AuthModel>()
    val authResponseModel = MutableLiveData<AuthResponseModel>()
    val isloading = MutableLiveData<Boolean>()
    private val api = AuthServise()
     fun login(authModel: AuthModel){
         isloading.postValue(true)
        viewModelScope.launch {
            val response = api.login(authModel)
            //println(api.login(authModel).toString())
            authResponseModel.postValue(response)
            isloading.postValue(false)
        }

        //this.authModel.postValue(authModel)
    }
}