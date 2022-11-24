package com.wefox.apitests.service

import com.wefox.apitests.dto.AccidentMetadata
import io.restassured.http.ContentType
import io.restassured.response.Response

import static com.wefox.apitests.utils.ConfigReader.getValue
import static io.restassured.RestAssured.given
import static io.restassured.http.ContentType.JSON

class PredictionsService {

    protected static final String HOST_URL = getValue('host-url')

    static Response getAccidentSeverity(
            AccidentMetadata accidentMetadata,
            ContentType contentType = JSON)
    {
        return given()
                .log().all()
                .contentType(contentType)
                .body(accidentMetadata)
            .when()
                .post("$HOST_URL/predictions/severity")
            .then()
                .log().all()
                .extract()
                .response()
    }
}
