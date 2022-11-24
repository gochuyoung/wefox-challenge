package com.wefox.apitests.dto

import com.google.gson.annotations.SerializedName

class AccidentMetadata {

    @SerializedName("vehicle_sit")
    float vehicleSit

    int weather

    float sex

    int year

    @SerializedName("birth_year")
    float birthYear

    @SerializedName("security_used")
    float securityUsed

    float hour

    float luminosity

    int department

    @SerializedName("in_agglomeration")
    float inAgglomeration

    @SerializedName("collision_type")
    float collisionType

    @SerializedName("road_type")
    float roadType

    @SerializedName("pathways_width")
    float pathwaysWidth

    @SerializedName("vehicle_type")
    float vehicleType

    @SerializedName("obstacle_type")
    float obstacleType

    @SerializedName("shock_location")
    float shockLocation

    @SerializedName("maneuver_type")
    float maneuverType
}
