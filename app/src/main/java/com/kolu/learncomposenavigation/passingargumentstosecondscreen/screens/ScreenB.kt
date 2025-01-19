package com.kolu.learncomposenavigation.passingargumentstosecondscreen.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kolu.learncomposenavigation.passingargumentstosecondscreen.navigation.PassArgTwoScreenNavScreens

@Composable
fun ScreenB(
    modifier: Modifier = Modifier.fillMaxSize(),
    navController: NavController
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val data = backStackEntry?.toRoute<PassArgTwoScreenNavScreens.ScreenB>()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Send Data to Second Screen",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "Screen B",
            fontSize = 20.sp,
        )

        Text(
            text = "Data from Screen A: " + data?.screenAdata1
        )

        Button(
            onClick = {
                navController.navigateUp()
            }
        ) {
            Text(
                text = "To A"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenAPrev() {
    ScreenB(navController = rememberNavController())
}