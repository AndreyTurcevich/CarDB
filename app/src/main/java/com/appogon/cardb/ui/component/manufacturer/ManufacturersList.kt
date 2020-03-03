package com.appogon.cardb.ui.component.manufacturer

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.layout.Row
import androidx.ui.layout.Spacing
import androidx.ui.layout.WidthSpacer
import com.appogon.cardb.model.Manufacturer

@Composable
fun HorizontalManufacturersList(manufacturers: List<Manufacturer>) {
    HorizontalScroller {
        Row(modifier = Spacing(right = 16.dp, bottom = 16.dp, top = 16.dp)) {
            manufacturers.forEach {
                WidthSpacer(16.dp)
                ManufacturerCard(it)
            }
        }
    }
}