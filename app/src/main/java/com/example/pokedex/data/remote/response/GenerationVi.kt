package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegarubyAlphasapphire: com.example.pokedex.data.remote.response.OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xY: com.example.pokedex.data.remote.response.XY
)