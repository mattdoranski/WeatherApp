package com.example.weatherapp.data

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    //Api endpoint to search weather by name
    @GET("v1/forecast.json?key=4705e075ff1b48c79ee173329262010&days=3&aqi=no&alerts=no")
    suspend fun searchWeather(
        @Query("q") query: String
    ): Weather
}