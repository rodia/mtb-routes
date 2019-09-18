package com.example.rutasbolivia

import com.google.gson.JsonObject
import java.io.Serializable
import java.lang.Exception

class Trail(couponJson: JsonObject?) : Serializable {
    var id: Int = 0
    lateinit var name: String
    lateinit var distance: String
    lateinit var trail: String
    var region: Int = 0

    init {
        try {
            id = couponJson!!.get(ID).asInt
            name = couponJson!!.get(NAME).asString
            distance = couponJson!!.get(DISTANCE).asString
            trail = couponJson!!.get(TRAIL).asString
            region = couponJson!!.get(REGION).asInt
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }

    companion object {
        private val ID = "id"
        private val NAME = "name"
        private val DISTANCE = "distance"
        private val TRAIL = "trail"
        private val REGION = "region"
    }
}
