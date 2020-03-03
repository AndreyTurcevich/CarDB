package com.appogon.cardb.model

import androidx.annotation.DrawableRes

data class Car(
    val id: String,
    @DrawableRes val imageId: Int,
    val title: String,
    val manufacturer: String,
    val year: String,
    val speed: String
)

