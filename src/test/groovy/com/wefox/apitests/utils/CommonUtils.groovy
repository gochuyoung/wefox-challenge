package com.wefox.apitests.utils

import groovy.json.JsonSlurper

class CommonUtils {

    static def convertTextToJson(String text) {
        return new JsonSlurper().parseText(text)
    }
}
