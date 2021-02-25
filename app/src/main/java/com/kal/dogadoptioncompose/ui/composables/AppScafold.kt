package com.kal.dogadoptioncompose.ui.composables

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@Composable
fun AppScaffold() {

    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "My Puppy Adoption Compose 🐶 🚀",
                        color = Color.White
                    )
                },
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.White,
                elevation = 12.dp
            )
        }) {


    }
}

