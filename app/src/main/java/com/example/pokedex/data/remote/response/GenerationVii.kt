package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: com.example.pokedex.data.remote.response.Icons,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: com.example.pokedex.data.remote.response.UltraSunUltraMoon
)