package com.appogon.cardb.start

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.setContent
import androidx.ui.material.DrawerState
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ModalDrawerLayout
import com.appogon.cardb.ui.screen.HomeScreen
import com.appogon.cardb.ui.theming.themeTypography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(typography = themeTypography) {
                val (drawerState, onDrawerStateChange) = +state { DrawerState.Closed }

                ModalDrawerLayout(drawerState = drawerState,
                    onStateChange = onDrawerStateChange,
                    drawerContent = {
                        // add your UI code
                    },
                    bodyContent = {
                        HomeScreen()
                    }
                )
//                    inflexible {
//                        BottomBar(listOf(
//                            ButtonData(R.drawable.ic_chart) { showMessage("action!") },
//                            ButtonData(R.drawable.ic_manufacturers) { showMessage("action!") },
//                            ButtonData(R.drawable.ic_cars) { showMessage("action!") }
//                        ))
//                    }
            }
        }
    }

    private fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }
}

