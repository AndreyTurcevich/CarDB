package com.appogon.cardb.ui.component.car

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Card
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import com.appogon.cardb.data.defaultCars
import com.appogon.cardb.model.Car

@Composable
fun CarCard(car: Car) {
    Card(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        Ripple(bounded = true) {
            Clickable(onClick = {
                //                               navigateTo(Screen.Article(post.id))
            }) {
                val image = +imageResource(car.imageId)
                Column {
                    Container(expanded = true, height = 144.dp) {
                        DrawImage(image = image)
                    }
                    Column(modifier = Spacing(16.dp)) {
                        Text(car.title)
                        Text(car.manufacturer)
                        Text(car.year)
                        Text(car.speed)
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun DefaultCarCard() {
    MaterialTheme {
        CarCard(defaultCars[0])
    }
}

//@Composable
//fun ManufacturerCard(manufacturer: Manufacturer) {
//    Card(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
//        Ripple(bounded = true) {
//            Clickable(onClick = {
//                //                navigateTo(Screen.Article(post.id))
//            }) {
//                Container(modifier = Size(320.dp, 180.dp)) {
//                    Column(modifier = Expanded) {
//                        val image = +imageResource(manufacturer.imageId)
//                        Container(modifier = Height(120.dp) wraps Expanded) {
//                            DrawImage(image)
//                        }
//                        Padding(padding = 8.dp) {
//                            Center {
//                                Text(
//                                    text = manufacturer.name,
//                                    style = ((+MaterialTheme.typography()).h6).withOpacity(0.87f),
//                                    maxLines = 2,
//                                    overflow = TextOverflow.Ellipsis
//                                )
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//}