package com.example.architecture_application.api

import com.example.architecture_application.models.DashboardResponse
import com.example.architecture_application.models.LoginRequest
import com.example.architecture_application.models.LoginResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.Call
import retrofit2.http.Path

interface ApiService {
    //Login Endpoint
    @POST("/sydney/auth")
    fun userLogin (@Body loginRequest: LoginRequest): Call<LoginResponse>

    //Dashboard Endpoint
    @GET("/dashboard/{keypass}")
    fun getEntities(@Path("keypass") keypass: String): Call<DashboardResponse>
}