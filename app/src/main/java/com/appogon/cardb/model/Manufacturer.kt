package com.appogon.cardb.model

import androidx.annotation.DrawableRes

data class Manufacturer(
    val id: String,
    @DrawableRes val imageId: Int,
    val name: String,
    val description: String
)