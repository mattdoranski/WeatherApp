package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.clearText
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.weatherapp.MainViewModel
import kotlin.math.roundToInt

@Composable
fun CurrentScreen(viewModel: MainViewModel) {

    val weather = viewModel.weather
    val searchTextFieldState = rememberTextFieldState(initialText = "")

    Column() {
        TextField(
            state = searchTextFieldState,
            label = { Text("Weather location?") }
        )

        Button(
            onClick = {
                // TO-DO: validate name first before calling function
                viewModel.searchWeather(searchTextFieldState.text.toString().trim())
                searchTextFieldState.clearText()
            }
        ) {
            Text("Go")
        }

        // Error message
        val errorMessage = viewModel.error
        errorMessage?.let {
            Text(
                errorMessage,
                color = MaterialTheme.colorScheme.error
            )
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            weather?.let {
//            Text(
//                text = weather.day,
//                style = MaterialTheme.typography.headlineSmall,
//                textAlign = TextAlign.Center
//            )

//            Image(
//                painter = painterResource(id = weather.resourceId),
//                contentDescription = "Weather Picture",
//            )

                Text(
                    text = it.current.condition.text,
                    style = MaterialTheme.typography.headlineLarge,
                    textAlign = TextAlign.Center
                )

                Text(
                    "Temp: " + it.current.tempC.roundToInt().toString() + "°C, Feels like: " +
                            it.current.feelsLikeC.roundToInt().toString() + "°C",
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center
                )

                Text(
                    "Wind: " + it.current.wind.roundToInt().toString() + "km/h " + it.current.windDir,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}