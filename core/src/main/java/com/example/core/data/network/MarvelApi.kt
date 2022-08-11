package com.example.core.data.network

import com.example.core.data.network.response.DataContainerResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MarvelApi {
    @GET
    suspend fun getCharacters(
        @QueryMap
        queries: Map<String, String>
    ): DataContainerResponse

}