package com.androiddevs.shoppinglisttestingyt.data.remote.responses

/**
 * Created by Abhinay on 18/10/23.
 */
data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)
