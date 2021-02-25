package com.kal.dogadoptioncompose.repositories

import com.kal.dogadoptioncompose.R
import com.kal.dogadoptioncompose.models.Dog

class DogRepository {

    /*

    val id: Int,
    val name: String,
    val description: String,
    val age: String,
    val gender: String,
    val race: String,
    val contactEmail: String,
    val image: Int
     */

     fun getAll(): List<Dog> = listOf(
        Dog(1, "Igor", "Looking for a family to adopt me, you will see that I will be your best friend", "2 months ago", "Male", "Labrador", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_1),
        Dog(2, "Aki", "I have good manners, we'll have a good time", "3 months ago", "Female", "Akita", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_2),
        Dog(3, "Bea", "With me you can spend hours and hours playing", "2 months ago", "Male", "Beagle", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_3),
        Dog(4, "Cool ie", "Looking for a new home where a new story begins", "4 months ago", "Female", "Collie", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_4),
        Dog(5, "Span", "I behave well, I have very good manners", "4 months ago", "Male", "Field Spaniel", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_5),
        Dog(6, "PugPug", "I am the best company you can have and a faithful friend", "3 months ago", "Female", "Pug", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_6),
        Dog(7, "Samo", "Ready to find a home where everyone brings joy", "2 months ago", "Male", "Samoyed", "kriptonsite_000@yahoo.com.mx", R.drawable.dog_7)
    )

    fun findById(id: Int) = getAll().firstOrNull { it.id == id }

}