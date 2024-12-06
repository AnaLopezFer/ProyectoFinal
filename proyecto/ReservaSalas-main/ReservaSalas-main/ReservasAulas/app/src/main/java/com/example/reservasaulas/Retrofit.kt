package com.example.reservasaulas

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
     private const val BASE_URL = "http://192.168.0.35:8080"


    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val usuarioApi: UsuarioApi by lazy {
        retrofit.create(UsuarioApi::class.java)
    }

    val libroApi: LibroApi by lazy {
        retrofit.create(LibroApi::class.java)
    }

    val reservaApi: ReservaApi by lazy {
        retrofit.create(ReservaApi::class.java)
    }
}
