package com.example.baseskeletonstarter.model.data

import com.squareup.moshi.Json

data class Item(
    val name: String,
    @Json(name = "image")
    val picture: String
)
