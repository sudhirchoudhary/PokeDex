package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue")
    val redBlue: com.example.pokedex.data.remote.response.RedBlue,
    val yellow: com.example.pokedex.data.remote.response.Yellow
)