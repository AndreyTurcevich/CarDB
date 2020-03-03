package com.appogon.cardb.ui.component.widgets

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.shape.DrawShape
import androidx.ui.foundation.shape.RectangleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.ripple.Ripple
import androidx.ui.tooling.preview.Preview
import com.appogon.cardb.R
import com.appogon.cardb.ui.component.image.VectorImage

data class ButtonData(@DrawableRes val drawableResId: Int, val action: () -> Unit)

@Composable
fun BottomBar(buttons: List<ButtonData>) {
    Container(expanded = true, height = 64.dp) {
        Column {
            Wrap {
                DrawShape(shape = RectangleShape, color = Color.White)
                FlexRow {
                    for (button in buttons) {
                        flexible(flex = 1f) {
                            BottomBarButton(button)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BottomBarButton(buttonData: ButtonData) {
    Ripple(bounded = true) {
        Container(expanded = true, height = 64.dp) {
            Clickable(onClick = buttonData.action) {
                Container(modifier = Size(48.dp, 48.dp)) {
                    VectorImage(id = buttonData.drawableResId, tint = Color.Black)
                }
            }
        }
    }
}

@Composable
@Preview
fun DefaultBottomBar() {
    BottomBar(
        listOf(
            ButtonData(R.drawable.ic_chart) {},
            ButtonData(R.drawable.ic_chart) {},
            ButtonData(R.drawable.ic_chart) {}
        )
    )
}