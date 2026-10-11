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

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
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
                    text = day1.day,
                    style = MaterialTheme.typography.titleMedium
                )

                Image(
                    painter = painterResource(id = R.drawable.sun),
                    contentDescription = "Weather Picture",
                    modifier = Modifier.size(60.dp)
                )

                Text(
                    text = day1.weather,
                    style = MaterialTheme.typography.headlineMedium
                )

                Text("Temperature: " + day1.temp + "°C, Feels like: " + day1.feelsLike + "°C")

                Text("Wind: " + day1.windSpeed + "km/h " + day1.windDirection)
            }
        }
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
                    text = day2.day,
                    style = MaterialTheme.typography.titleMedium
                )

                Image(
                    painter = painterResource(id = R.drawable.rainy),
                    contentDescription = "Weather Picture",
                    modifier = Modifier.size(60.dp)
                )

                Text(
                    text = day2.weather,
                    style = MaterialTheme.typography.headlineMedium
                )

                Text("Temperature: " + day2.temp + "°C, Feels like: " + day2.feelsLike + "°C")

                Text("Wind: " + day2.windSpeed + "km/h " + day2.windDirection)
            }
        }
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
                    text = day3.day,
                    style = MaterialTheme.typography.titleMedium
                )

                Image(
                    painter = painterResource(id = R.drawable.partlycloudy),
                    contentDescription = "Weather Picture",
                    modifier = Modifier.size(60.dp)
                )

                Text(
                    text = day3.weather,
                    style = MaterialTheme.typography.headlineMedium
                )

                Text("Temperature: " + day3.temp + "°C, Feels like: " + day3.feelsLike + "°C")

                Text("Wind: " + day3.windSpeed + "km/h " + day3.windDirection)
            }
        }
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
                    text = day1.day,
                    style = MaterialTheme.typography.titleMedium
                )

                Image(
                    painter = painterResource(id = R.drawable.sun),
                    contentDescription = "Weather Picture",
                    modifier = Modifier.size(60.dp)
                )

                Text(
                    text = day1.weather,
                    style = MaterialTheme.typography.headlineMedium
                )

                Text("Temperature: " + day1.temp + "°C, Feels like: " + day1.feelsLike + "°C")

                Text("Wind: " + day1.windSpeed + "km/h " + day1.windDirection)
            }
        }
    }
}