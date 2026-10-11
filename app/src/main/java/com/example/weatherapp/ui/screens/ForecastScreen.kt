package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.models.Weather

@Composable
fun ForecastScreen(){

    //Load Weather
    val day1 = Weather(
        weather = "Sunny",
        temp = 22,
        feelsLike = 21,
        windSpeed = 3,
        windDirection = "S",
        day = "Sat, October 10",
        description = "",
        resourceId = R.drawable.sun
    )

    val day2 = Weather(
        weather = "Rain",
        temp = 9,
        feelsLike = 5,
        windSpeed = 20,
        windDirection = "NE",
        day = "Sun, October 11",
        description = "",
        resourceId = R.drawable.rainy
    )

    val day3 = Weather(
        weather = "Partly Cloudy",
        temp = 12,
        feelsLike = 10,
        windSpeed = 15,
        windDirection = "NW",
        day = "Mon, October 12",
        description = "",
        resourceId = R.drawable.partlycloudy
    )

    val day4 = Weather(
        weather = "Storm",
        temp = 8,
        feelsLike = 5,
        windSpeed = 43,
        windDirection = "SW",
        day = "Tue, October 13",
        description = "",
        resourceId = R.drawable.storm
    )

    val days = listOf(day1, day2, day3, day4)

    Column(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        days.forEach { day ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text(
                        text = day.day,
                        style = MaterialTheme.typography.titleMedium
                    )

                    Image(
                        painter = painterResource(id = day.resourceId),
                        contentDescription = "Weather Picture",
                        modifier = Modifier.size(60.dp)
                    )

                    Text(
                        text = day.weather,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text("Temperature: " + day.temp + "°C, Feels like: " + day.feelsLike + "°C")

                    Text("Wind: " + day.windSpeed + "km/h " + day.windDirection)
                }
            }
        }
    }
}