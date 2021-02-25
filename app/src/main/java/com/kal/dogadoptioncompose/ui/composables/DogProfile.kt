package com.kal.dogadoptioncompose.ui.composables


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kal.dogadoptioncompose.R
import com.kal.dogadoptioncompose.repositories.DogRepository

@Composable
fun DogProfile(navController: NavController, id: String?) {
    val dog = DogRepository().findById(id)

    val image = painterResource(id = dog?.image ?: R.drawable.dog_0)

    val imageModifier = Modifier
        .padding(vertical = 4.dp)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = dog?.name ?: "",
                        color = Color.White
                    )
                },
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.White,
                elevation = 12.dp,
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Filled.ArrowBack, "")
                    }
                }
            )
        }) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Image(painter = image, contentDescription = "", modifier = imageModifier)
            Text(dog?.name ?: "", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
            Text(dog?.description ?: "", modifier = Modifier.padding(vertical = 4.dp))
            Text("Race: ${dog?.race}", modifier = Modifier.padding(vertical = 4.dp))
            Text("Age: ${dog?.age}", modifier = Modifier.padding(vertical = 4.dp))
            Text("Gender: ${dog?.gender}", modifier = Modifier.padding(vertical = 4.dp))
        }

    }

}