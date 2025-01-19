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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.kolu.learncomposenavigation.basicnavigation.navigation.BasicNavScreens
import com.kolu.learncomposenavigation.passingargumentstosecondscreen.navigation.PassArgTwoScreen
import com.kolu.learncomposenavigation.passingargumentstosecondscreen.navigation.PassArgTwoScreenNavScreens

@Composable
fun ScreenA(
    modifier: Modifier = Modifier.fillMaxSize(),
    navController: NavController
) {
    var text by remember { mutableStateOf("")}
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Send Data to Second Screen",
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = "Screen A",
            fontSize = 20.sp,
        )
        OutlinedTextField(
            value = text,
            onValueChange = { value->
                text = value
            }
        )
        Button(
            onClick = {
                navController.navigate(
                    PassArgTwoScreenNavScreens.ScreenB(
                        screenAdata1 = text,
                        screenAdata2 = 0
                ))
            }
        ) {
            Text(
                text = "Send data to B"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenAPrev() {
    ScreenA(navController = rememberNavController())
}
