package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
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
        day = "Fri, October 9",
        description = "Cloudy for the next 6 hours becoming cloudier overnight.",
        resourceId = R.drawable.overcast
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = weather.day,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center
        )

        Image(
            painter = painterResource(id = weather.resourceId),
            contentDescription = "Weather Picture",
        )

        Text(
            text = weather.weather,
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center
        )

        Text(
            "Temperature: " + weather.temp + "°C, Feels like: " + weather.feelsLike + "°C",
            textAlign = TextAlign.Center
        )

        Text(
            "Wind: " + weather.windSpeed + "km/h " + weather.windDirection,
            textAlign = TextAlign.Center
        )

        Text(
            weather.description,
            textAlign = TextAlign.Center
        )
    }
}