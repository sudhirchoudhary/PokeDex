package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: com.example.pokedex.data.remote.response.Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: com.example.pokedex.data.remote.response.FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: com.example.pokedex.data.remote.response.RubySapphire
)