package com.example.pokedex.data.remote.response

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.example.pokedex.data.remote.response.StatX
)