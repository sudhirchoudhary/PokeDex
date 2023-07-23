package com.example.pokedex.data.remote.response.pokelist

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<com.example.pokedex.data.remote.response.pokelist.Result>
)