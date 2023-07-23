package com.example.pokedex.data.remote.response

import com.google.gson.annotations.SerializedName

data class Ability(
    val ability: com.example.pokedex.data.remote.response.AbilityX,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)