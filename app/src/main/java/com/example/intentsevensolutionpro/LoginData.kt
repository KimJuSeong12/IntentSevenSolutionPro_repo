package com.example.intentsevensolutionpro

import java.io.Serializable

// Serializable Gson과 똑같지만 데이터 안에있는 것을 하나씩 나열하게 하는 것
data class LoginData(val id: String, val pwd: String) : Serializable
