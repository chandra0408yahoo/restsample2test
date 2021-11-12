package util;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.core.api.Assertions.assertThat;


public class StudentSerenitySteps {

    public Response response;
    public String baseUrl="https://reqres.in";
    private DataGenerator dataGenerator = new DataGenerator();
    public String firstname;

    public Response getallusers(){

        SerenityRest.reset();


        return   response = SerenityRest
                       .given()
                       .relaxedHTTPSValidation()
                       .contentType(ContentType.JSON)
                       .baseUri(baseUrl)
                       .request()
                       .log().all()
                       .get("/api/users/2");




    }


    public void printdata(){
        System.out.println( response.then().extract().asString()+"<<REPNSE");
        firstname = response.then().extract().jsonPath().get("data.first_name").toString();
        assertThat(firstname).isEqualTo("Janet");
    }





   public void verifyThatResponseWasOk(){

       System.out.println(response.then().extract().statusCode()+"<<<<<<<<<<");
       assertThat(response.then().extract().statusCode()).isEqualTo(SC_OK);

   }


    public Response postdata(){

        SerenityRest.reset();

        return response = SerenityRest
                .given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .baseUri(baseUrl)
                .body(dataGenerator.dataforuser())
                .request()
                .log().all()
                .post("/api/users");


    }


    public void verifyThatResponseWasCreated() {
        assertThat(response.then().extract().statusCode()).isEqualTo(SC_CREATED);
    }


}
