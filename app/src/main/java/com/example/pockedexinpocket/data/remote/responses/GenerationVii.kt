package com.example.pockedexinpocket.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: Icons,
    @SerializedName("ultra-sun-ultra")
    val ultraSunUltraMoon: UltraSunUltraMoon
)