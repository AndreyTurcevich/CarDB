package com.appogon.cardb

import androidx.compose.Model

sealed class Screen {
    object CarsList : Screen()
    data class CarDetails(val carId: String) : Screen()
}

@Model
object AppStatus {
    var currentScreen: Screen = Screen.CarsList
}

fun navigateTo(destination: Screen) {
    AppStatus.currentScreen = destination
}