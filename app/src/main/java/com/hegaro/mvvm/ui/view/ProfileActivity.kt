package com.hegaro.mvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.hegaro.mvvm.data.model.UserModel
import com.hegaro.mvvm.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    //private lateinit var binding : ActivityMainBinding
    companion object{
        const val EXTRA_USER = "ProfileActivity:user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_profile)
        val user = intent.getParcelableExtra<UserModel>(EXTRA_USER)
        if (user != null){
            binding.username.text = user.username
            Glide.with(this)
                .load(user.avatar)
                .into(binding.ivImgProfile)
        }

    }
}