package com.appogon.cardb.ui.component.car

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.Spacing
import com.appogon.cardb.model.Car

@Composable
fun VerticalCarsList(cars: List<Car>) {
    VerticalScroller {
        Column(modifier = Spacing(right = 16.dp, left = 16.dp, bottom = 16.dp)) {
            cars.forEach {
                HeightSpacer(16.dp)
                CarCard(it)
            }
        }
    }
}

