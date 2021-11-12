package util;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class BaseClass {

    @BeforeClass
    public static void init() {
        RestAssured.baseURI="https://reqres.in/";
    }
}
