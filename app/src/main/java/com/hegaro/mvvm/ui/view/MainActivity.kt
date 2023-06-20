package com.hegaro.mvvm.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.hegaro.mvvm.databinding.ActivityMainBinding
import com.hegaro.mvvm.data.model.AuthModel
import com.hegaro.mvvm.data.model.AuthResponseModel
import com.hegaro.mvvm.ui.viewmodel.AuthViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val authViewModel:AuthViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        authViewModel.authResponseModel.observe(this,Observer {
            println(it.toString())
            navegateTo(it)
        })
        authViewModel.isloading.observe(this, Observer {
            binding.progress.isVisible = it
        })
        binding.btmLogin.setOnClickListener{
            val request = AuthModel(
                email = binding.editTextEmail.text.toString(),
                password = binding.editTextPassword.text.toString())
            authViewModel.login(authModel= request)
        }
    }
    private fun navegateTo(authResponseModel: AuthResponseModel){
        val intent = Intent(this,ProfileActivity::class.java)
        intent.putExtra(ProfileActivity.EXTRA_USER,authResponseModel.user)
        startActivity(intent)
    }
    //btmLogin.se
}