package org.example.ex01_SampleCheck;

import io.restassured.RestAssured;

public class APITesting002 {
    public static void main(String[] args) {

        //Gherkins Syntax
        //Full URL - https://api.zippopotam.us/IN/560016
        // Base URI - https://api.zippopotam.us
        //base path - /IN/560016

        RestAssured
                .given()
                       .baseUri("https://api.zippopotam.us")
                       .basePath("/IN/560016")
                .when()
                      .get()
                .then().log().all().statusCode(200);
    }
}
