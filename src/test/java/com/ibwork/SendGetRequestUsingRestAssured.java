package com.ibwork;

import static org.junit.Assert.assertTrue;
//import static io.restassured.RestA;
//import static io.restassured.matcher.restassured
// import static io.restassured.RestAssured.*;
// import static io.restassured.matcher.RestAssuredMatchers.*;
// import static org.hamcrest.Matchers.*;

// import static io.restassured.authentication;
//import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

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
        Response resp = new Response();
        Response response = get("lotto");
        resp.get();



    }
    /*
     * public void shouldAnswerWithTrue()
     * //{
     * assertTrue( true );
     * }
     */
}
