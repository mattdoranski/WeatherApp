package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.weatherapp.R
import com.example.weatherapp.models.Weather

@Composable
fun CurrentScreen(){

    //Load Weather
    val weather = Weather(
        weather = "Overcast",
        temp = 16,
        feelsLike = 9,
        windSpeed = 20,
        windDirection = "SW",
        day = "October 9",
        description = "",
        resourceId = R.drawable.cloudy
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = weather.day,
            style = MaterialTheme.typography.headlineSmall)

        Image(painter = painterResource(id = R.drawable.cloudy),
            contentDescription = "Weather Picture",
        )

        Text(text = weather.weather,
            style = MaterialTheme.typography.headlineLarge)

        Text("Temperature: " + weather.temp + "°C, Feels like: " + weather.feelsLike + "°C")

        Text("Wind: " + weather.windSpeed + "kmp/h " + weather.windDirection)

        Text(weather.description)
    }
}