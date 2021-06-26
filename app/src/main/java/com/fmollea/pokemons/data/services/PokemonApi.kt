package com.fmollea.pokemons.data.services

import com.fmollea.pokemons.data.services.data.PokemonDetailResponse
import com.fmollea.pokemons.data.services.data.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("pokemon")
    suspend fun getAllPokemons(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<PokemonResponse>

    @GET("pokemon/{name}")
    suspend fun getPokemonByName(
        @Path("name") name: String
    ): Response<PokemonDetailResponse>
}