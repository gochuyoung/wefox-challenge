package com.wefox.apitests.factory

import com.wefox.apitests.dto.AccidentMetadata

import static com.wefox.apitests.utils.ConfigReader.getValue
import static java.lang.Float.parseFloat
import static java.lang.Integer.parseInt

class AccidentMetadataFactory {

    protected static final String DATA_SOURCE_CSV = getValue('data-source')
    static def accidentMetadataDataSet = []

    static def readAccidentMetadataFromCSV() {
        new BufferedReader(new FileReader(DATA_SOURCE_CSV))
                .lines()
                .skip(1)
                .forEach(accidentMetaDataCSVLine ->
                        accidentMetadataDataSet.add(
                                createAccidentMetadata(accidentMetaDataCSVLine.split(','))
                        )
                )
        return accidentMetadataDataSet
    }

    static def createAccidentMetadata(String[] CSVLine) {
        return new AccidentMetadata(
                vehicleSit: parseFloat(CSVLine[1]),
                weather: parseInt(CSVLine[2]),
                sex: parseFloat(CSVLine[3]),
                year: parseInt(CSVLine[4]),
                birthYear: parseFloat(CSVLine[5]),
                securityUsed: parseFloat(CSVLine[6]),
                hour: parseFloat(CSVLine[7]),
                luminosity: parseFloat(CSVLine[8]),
                department: parseInt(CSVLine[9]),
                inAgglomeration: parseFloat(CSVLine[10]),
                collisionType: parseFloat(CSVLine[11]),
                roadType: parseFloat(CSVLine[12]),
                pathwaysWidth: parseFloat(CSVLine[13]),
                vehicleType: parseFloat(CSVLine[14]),
                obstacleType: parseFloat(CSVLine[15]),
                shockLocation: parseFloat(CSVLine[16]),
                maneuverType: parseFloat(CSVLine[17])
        )
    }
}