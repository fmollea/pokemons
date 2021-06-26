package com.fmollea.pokemons.data.services.data

data class PokemonResponse(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Pokemon>
)