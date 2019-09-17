package com.example.rutasbolivia.model

data class Trail(var name: String, var distance: String, var route:ArrayList<Route>?)
data class Route(var latitude: String, var longitude: String)
