package com.example.weatherapp.models

data class Weather(
    val weather: String,

    val temp: Int,

    val feelsLike: Int,

    val windSpeed: Int,

    val windDirection: String,

    val day: String,

    val description: String,

    val resourceId: Int // Drawable
)