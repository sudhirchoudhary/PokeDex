package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GameIndice(
    @SerializedName("game_index")
    val gameIndex: Int,
    val version: com.example.pokedex.data.remote.response.Version
)