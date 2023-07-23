package com.example.pokedex.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ) : com.example.pokedex.data.remote.response.pokelist.PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonDetail(
        @Path("name") pokemonName: String
    ) : com.example.pokedex.data.remote.response.Pokemon
}