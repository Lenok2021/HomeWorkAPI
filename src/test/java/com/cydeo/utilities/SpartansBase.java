package com.cydeo.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class SpartansBase {

    @BeforeAll
    public static void test(){

        RestAssured.baseURI ="http://54.234.53.165:8000";



    }






}
