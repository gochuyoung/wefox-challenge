package com.wefox.apitests

import org.junit.Rule
import org.junit.rules.TestName
import org.junit.rules.Timeout
import spock.lang.Specification

import static io.restassured.RestAssured.useRelaxedHTTPSValidation

class BaseSpec extends Specification {

    static int globalTimeoutInMillis = 20000

    @Rule
    Timeout globalTimeout = new Timeout(globalTimeoutInMillis)

    @Rule
    TestName name = new TestName()

    def setupSpec() {
        useRelaxedHTTPSValidation()
    }
}
