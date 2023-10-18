package com.androiddevs.shoppinglisttestingyt.data.remote

import com.androiddevs.shoppinglisttestingyt.BuildConfig
import com.androiddevs.shoppinglisttestingyt.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Abhinay on 18/10/23.
 */
interface PixabayAPI {

    @GET("/api")
    suspend fun searhForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = BuildConfig.API_KEY
    ): Response<ImageResponse>
}