package com.example.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/256cc6136de6c76ee18fa08dd5115508/search/{name}")
    suspend fun getSuperheros(@Path("name") superheroName: String): Response <SuperHeroDataResponse>

    @GET("/api/256cc6136de6c76ee18fa08dd5115508/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String): Response <SuperheroDetailResponse>

}