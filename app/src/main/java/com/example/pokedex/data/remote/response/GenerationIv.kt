package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamondPearl: com.example.pokedex.data.remote.response.DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: com.example.pokedex.data.remote.response.HeartgoldSoulsilver,
    val platinum: com.example.pokedex.data.remote.response.Platinum
)