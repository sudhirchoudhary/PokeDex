package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class Other(
    val dream_world: com.example.pokedex.data.remote.response.DreamWorld,
    val home: com.example.pokedex.data.remote.response.Home,
    @SerializedName("official-artwork")
    val officialArtwork: com.example.pokedex.data.remote.response.OfficialArtwork
)