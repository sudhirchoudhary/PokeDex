package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i")
    val generation1: com.example.pokedex.data.remote.response.GenerationI,
    @SerializedName("generation-ii")
    val generation2: com.example.pokedex.data.remote.response.GenerationIi,
    @SerializedName("generation-iii")
    val generation3: com.example.pokedex.data.remote.response.GenerationIii,
    @SerializedName("generation-iv")
    val generation4: com.example.pokedex.data.remote.response.GenerationIv,
    @SerializedName("generation-v")
    val generation5: com.example.pokedex.data.remote.response.GenerationV,
    @SerializedName("generation-vi")
    val generation6: com.example.pokedex.data.remote.response.GenerationVi,
    @SerializedName("generation-vii")
    val generation7: com.example.pokedex.data.remote.response.GenerationVii,
    @SerializedName("generation-viii")
    val generation8: com.example.pokedex.data.remote.response.GenerationViii
)