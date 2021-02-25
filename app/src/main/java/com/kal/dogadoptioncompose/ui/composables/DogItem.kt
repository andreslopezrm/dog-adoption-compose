package com.kal.dogadoptioncompose.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.kal.dogadoptioncompose.R
import com.kal.dogadoptioncompose.models.Dog

@Composable
fun DogItem(dog: Dog, navController: NavController) {
    val image = painterResource(id = dog.image)

    val imageModifier = Modifier
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(4.dp))
        .padding(vertical = 4.dp)

    Card(
        Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navController.navigate("profile/${dog.id}")
            },
        elevation = 8.dp){

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Image(painter = image, contentDescription = "", modifier = imageModifier)
            Text(dog.name, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
            Text(dog.race, modifier = Modifier.padding(vertical = 4.dp))

            Button(onClick = { navController.navigate("profile/${dog.id}") }) {
                Text("More")
            }
        }
    }
}