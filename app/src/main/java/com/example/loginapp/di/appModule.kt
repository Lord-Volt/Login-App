package com.example.loginapp.di

import com.example.loginapp.login.presentation.login_screen.LoginScreenViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {

    viewModelOf(::LoginScreenViewModel)
}