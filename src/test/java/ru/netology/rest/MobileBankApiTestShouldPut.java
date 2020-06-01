package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class MobileBankApiTestShouldPut {

    @Test
    void shouldPut() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Petrov")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Petrov"));
    }
}
