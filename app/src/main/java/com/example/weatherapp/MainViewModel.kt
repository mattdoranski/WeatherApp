package com.example.weatherapp

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.Weather
import com.example.weatherapp.data.WeatherApi
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainViewModel : ViewModel() {

    var weather by mutableStateOf<Weather?>(null) // DAO

    var error by mutableStateOf<String?>(null)

    private val api = Retrofit.Builder()
        .baseUrl("https://api.weatherapi.com/") // api hostname
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(WeatherApi::class.java) // interface

    // Call searchWeather func from interface. Doesn't return a value, stores result in pokemon
    fun searchWeather(query: String) {
        // Launch co-routine

            try {
                viewModelScope.launch {
                    weather = api.searchWeather(query)
                    error = null;
                }
            } catch (e: Exception) {
                Log.e("MainViewModel", e.toString())
                error = "The location was not found"
            }

    }
}