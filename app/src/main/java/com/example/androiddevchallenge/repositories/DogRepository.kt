/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.repositories

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Dog

class DogRepository {

    fun getAll(): List<Dog> = listOf(
        Dog("aa8b0e01", "Igor", "Looking for a family to adopt me, you will see that I will be your best friend", "2 months ago", "Male", "Labrador", R.drawable.dog_1),
        Dog("ba4b0e02", "Aki", "I have good manners, we'll have a good time", "3 months ago", "Female", "Akita", R.drawable.dog_2),
        Dog("ca6b0e03", "Bea", "With me you can spend hours and hours playing", "2 months ago", "Male", "Beagle", R.drawable.dog_3),
        Dog("da9b0e04", "Cool ie", "Looking for a new home where a new story begins", "4 months ago", "Female", "Collie", R.drawable.dog_4),
        Dog("ea5b0e05", "Span", "I behave well, I have very good manners", "4 months ago", "Male", "Field Spaniel", R.drawable.dog_5),
        Dog("fa3b0e06", "PugPug", "I am the best company you can have and a faithful friend", "3 months ago", "Female", "Pug", R.drawable.dog_6),
        Dog("ga2b0e07", "Samo", "Ready to find a home where everyone brings joy", "2 months ago", "Male", "Samoyed", R.drawable.dog_7)
    )

    fun findById(id: String?) = getAll().firstOrNull { it.id == id }
}
