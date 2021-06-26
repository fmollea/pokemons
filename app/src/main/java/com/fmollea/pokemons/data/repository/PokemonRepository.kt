package com.fmollea.pokemons.data.repository

import com.fmollea.pokemons.data.services.PokemonApi
import javax.inject.Inject

class PokemonRepository@Inject constructor(
    private val client: PokemonApi
) {
    suspend fun getPokemons(offset: Int, limit: Int) = client.getAllPokemons(offset, limit)
    suspend fun getPokemonByName(name: String) = client.getPokemonByName(name)
}