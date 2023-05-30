package com.ibwork;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import io.restassured.response.Response;
import io.restassured.RestAssured;
//import io.restassured.RestAssured.*;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SendGetRequestUsingRestAssured {
    /**
     * Rigorous Test :-)
     * Set authentication: - Basic Auth / Bearer token using Headers
     * Request --> Send Request
     * Response --> Do Validations
     */
    @Test
    public static void main (String[] args) {
        //given().auth();
        // Response response = RestAssured.given().auth().basic("add stripe key", "").get("https://api.stripe.com/v1/customers");
        // response.prettyPrint();
        Response response = RestAssured.get("https://swapi.dev/api/people/2");
        response.prettyPrint();
        //RestAssured.given().contentType(ContentType.json);
        //RestAssured.given().header("content-type", "application/json");
        //Response response = RestAssured.get("/users/eugenp");
    //     long timeInMS = response.time();
    //     long timeInS = response.timeIn(TimeUnit.SECONDS);
    
    // assertEquals(timeInS, timeInMS/1000);



    }
    /*
     * public void shouldAnswerWithTrue()
     * //{
     * assertTrue( true );
     * }
     */
}
