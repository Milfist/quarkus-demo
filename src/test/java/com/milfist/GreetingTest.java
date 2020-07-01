package com.milfist;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingTest {

  @Test
  public void testGreetingEndpoint() {

    String name = "Miguel";

    given()
        .pathParam("name", name)
        .when().get("/v1/hello/{name}")
        .then()
        .statusCode(200)
        .body(is("hello " + name));
  }

}
