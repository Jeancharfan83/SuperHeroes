package com.example.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheroes: List<SuperheroItemResponse>
)
        data class SuperheroItemResponse(
            @SerializedName("id") val superheroId:String,
            @SerializedName("name") val name:String,
            @SerializedName("image") val SuperheroImage:SuperheroImageResponse


        )
data class SuperheroImageResponse(@SerializedName("url") val url:String) //porque está en una sub rama del arbol