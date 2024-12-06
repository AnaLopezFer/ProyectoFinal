package com.example.reservasaulas

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

data class LoginRequest(val username: String, val password: String)

interface UsuarioApi {
    @POST("/auth/login")
    fun login(@Body request: LoginRequest): Call<String>

    @GET("/usuarios")
    fun getAllUsuarios(): Call<List<Usuario>>
}

data class Usuario(val idUsuario: Int, val nombreUsuario: String, val contrasenha: String)
