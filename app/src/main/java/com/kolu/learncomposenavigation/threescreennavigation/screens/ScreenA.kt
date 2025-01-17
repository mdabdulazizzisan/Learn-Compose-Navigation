package com.kolu.learncomposenavigation.threescreennavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kolu.learncomposenavigation.threescreennavigation.navigation.ThreeScreenNavScreens

@Composable
fun ScreenA(
    modifier: Modifier = Modifier.fillMaxSize(),
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Three Screen Navigation",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "Screen A",
            fontSize = 20.sp,
        )
        Button(
            onClick = {
                navController.navigate(ThreeScreenNavScreens.ScreenB)
            }
        ) {
            Text(
                text = "To B"
            )
        }
        Button(
            onClick = {
                navController.navigate(ThreeScreenNavScreens.ScreenC)
            }
        ) {
            Text(
                text = "To C"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenAPrev() {
    ScreenA(navController = rememberNavController())
}