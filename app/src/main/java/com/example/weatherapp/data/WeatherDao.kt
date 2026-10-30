package com.example.weatherapp.data

import com.google.gson.annotations.SerializedName

data class Weather(
    val location: Location,

    val current: Current,

    val forecast: Forecast
)

data class Location(
    val name: String,

    val region: String,

    val country: String
)

data class Current(
    @SerializedName("temp_c") val tempC: Double,

    @SerializedName("temp_f") val tempF: Double,

    val condition: Condition,

    @SerializedName("wind_kph") val wind: Double,

    @SerializedName("wind_dir") val windDir: String,

    @SerializedName("precip_mm") val precip: Double,

    val humidity: Int,

    @SerializedName("feelslike_c") val feelsLikeC: Double,

    @SerializedName("feelslike_f") val feelsLikeF: Double,

    @SerializedName("windchill_c") val windChillC: Double, // maybe?

    @SerializedName("windchill_f") val windChillF: Double, // maybe?

    val uv: Double,

    @SerializedName("chance_of_rain") val rainChance: Int,

    @SerializedName("chance_of_snow") val snowChance: Int
)

data class Condition(
    val text: String,

    val icon: String
)


data class Forecast(
    @SerializedName("forecastday") var forecastDay: List<ForecastDay>
)

data class ForecastDay(
    var date: String,

    var day: Day
)

data class Day(
    @SerializedName("maxtemp_c") val maxTempC: Double,

    @SerializedName("maxtemp_f") val maxTempF: Double,

    @SerializedName("mintemp_c") val minTempC: Double,

    @SerializedName("mintemp_f") val minTempF: Double,

    @SerializedName("avgtemp_c") val avgTempC: Double,

    @SerializedName("avgtemp_f") val avgTempF: Double,

    val condition: Condition,

    @SerializedName("maxwind_kph") val maxWind: Double,

    @SerializedName("totalprecip_mm") val precip: Double,

    @SerializedName("avghumidity") val humidity: Int,

    val uv: Double,

    @SerializedName("daily_chance_of_rain") val rainChance: Int,

    @SerializedName("daily_chance_of_snow") val snowChance: Int
)