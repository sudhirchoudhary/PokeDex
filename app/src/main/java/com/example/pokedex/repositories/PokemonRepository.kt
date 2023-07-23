package com.example.pokedex.repositories

import com.example.pokedex.data.remote.PokeApi
import com.example.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val pokeApi: PokeApi
) {
    suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ) : Resource<com.example.pokedex.data.remote.response.pokelist.PokemonList> {
        val response = try {
            pokeApi.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown exception occurred = ${e.message}")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonDetail(
        pokemonName: String
    ) : Resource<com.example.pokedex.data.remote.response.Pokemon> {
        val response = try {
            pokeApi.getPokemonDetail(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown exception occurred")
        }
        return Resource.Success(response)
    }
}