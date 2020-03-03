package com.appogon.cardb.ui.screen

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import com.appogon.cardb.R
import com.appogon.cardb.data.defaultCars
import com.appogon.cardb.data.defaultManufacturers
import com.appogon.cardb.ui.component.car.VerticalCarsList
import com.appogon.cardb.ui.component.image.VectorImageButton
import com.appogon.cardb.ui.component.manufacturer.HorizontalManufacturersList

@Composable
fun HomeScreen() {
    VerticalScroller {
        Column {
            TopAppBar(
                title = { Text(text = "Jetnews") },
                navigationIcon = {
                    VectorImageButton(R.drawable.ic_menu) {
//                        openDrawer()
                    }
                }
            )
            Text(
                modifier = Spacing(left = 16.dp, top = 16.dp, right = 16.dp),
                text = "Biggest car manufacturers in the world",
                style = ((+MaterialTheme.typography()).subtitle1)
            )
            HorizontalManufacturersList(manufacturers = defaultManufacturers)

            Text(
                modifier = Spacing(left = 16.dp, top = 16.dp, right = 16.dp),
                text = "Biggest car manufacturers in the world",
                style = ((+MaterialTheme.typography()).subtitle1)
            )
            HorizontalManufacturersList(manufacturers = defaultManufacturers)

            Text(
                modifier = Spacing(left = 16.dp, top = 16.dp, right = 16.dp),
                text = "Biggest car manufacturers in the world",
                style = ((+MaterialTheme.typography()).subtitle1)
            )
            HorizontalManufacturersList(manufacturers = defaultManufacturers)
//            Text(
//                modifier = Spacing(left = 16.dp, right = 16.dp),
//                text = "FastestCars",
//                style = ((+MaterialTheme.typography()).subtitle1)
//            )
//            VerticalCarsList(cars = defaultCars)
        }
    }
}