package com.kal.dogadoptioncompose.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kal.dogadoptioncompose.repositories.DogRepository

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DogList(navController: NavController) {
    val list = DogRepository().getAll()

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

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        ) {
            items(items = list) { dog ->
                DogItem(dog = dog, navController = navController)
            }
        }

    }

}