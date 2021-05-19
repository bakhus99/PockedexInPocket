package com.example.pockedexinpocket.pokemonDetail

import androidx.lifecycle.ViewModel
import com.example.pockedexinpocket.data.remote.responses.Pokemon
import com.example.pockedexinpocket.repository.PokemonRepository
import com.example.pockedexinpocket.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName:String):Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }



}