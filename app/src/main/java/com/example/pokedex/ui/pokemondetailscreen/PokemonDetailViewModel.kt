package com.example.pokedex.ui.pokemondetailscreen

import androidx.lifecycle.ViewModel
import com.example.pokedex.data.remote.response.Pokemon
import com.example.pokedex.repositories.PokemonRepository
import com.example.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val pokemonRepository: PokemonRepository
): ViewModel(){
    suspend fun getPokemonDetail(pokemonName: String) : Resource<Pokemon> {
        return pokemonRepository.getPokemonDetail(pokemonName)
    }
}