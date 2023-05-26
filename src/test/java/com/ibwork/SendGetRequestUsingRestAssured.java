package com.ibwork;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import io.restassured.response.Response;
import io.restassured.RestAssured;
//import io.restassured.RestAssured.*;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;

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
        Response response = RestAssured.get("/users/eugenp");
        long timeInMS = response.time();
        long timeInS = response.timeIn(TimeUnit.SECONDS);
    
    assertEquals(timeInS, timeInMS/1000);



    }
    /*
     * public void shouldAnswerWithTrue()
     * //{
     * assertTrue( true );
     * }
     */
}
