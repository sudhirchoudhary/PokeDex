package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: com.example.pokedex.data.remote.response.BlackWhite
)