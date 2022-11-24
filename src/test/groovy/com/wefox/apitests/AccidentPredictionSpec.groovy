package com.wefox.apitests

import com.wefox.apitests.dto.AccidentMetadata
import com.wefox.apitests.factory.AccidentMetadataFactory
import spock.lang.Unroll

import static com.wefox.apitests.service.PredictionsService.getAccidentSeverity
import static com.wefox.apitests.utils.CommonUtils.convertTextToJson

class AccidentPredictionSpec extends BaseSpec {
    def responses = []

    @Unroll
    def "should return severity value in range from 0 to 3"() {
        given:
            AccidentMetadata[] dataSets = AccidentMetadataFactory.readAccidentMetadataFromCSV()
        when:
            dataSets.each {
                set -> responses.add(getAccidentSeverity(set))
            }
        then:
            responses.each {
                response ->
                    def predictionResponse = convertTextToJson(response.getBody().asString())
                    assert predictionResponse.severity in 0..3
                    assert response.statusCode() == 200
            }
    }
}
