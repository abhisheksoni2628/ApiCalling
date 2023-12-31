package com.example.complexapicalling.interfaces

import com.example.complexapicalling.model.BaseAbility
import com.example.complexapicalling.model.BaseClass
import com.example.complexapicalling.model.DataModel
import com.example.complexapicalling.model.PokemonModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiCall {

    @GET("pokemon/")
    fun getNames(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Call<BaseClass>

    @GET("pokemon/{id}/")
    fun getAbilities(
        @Path("id") pathId: Int
    ): Call<BaseAbility>

    @GET("ability/{id}/")
    fun getData(
        @Path("id") pathId: Int
    ) : Call<DataModel>

}