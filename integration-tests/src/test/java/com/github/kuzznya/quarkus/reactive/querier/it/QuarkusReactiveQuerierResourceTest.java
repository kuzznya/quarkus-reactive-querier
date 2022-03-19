package com.github.kuzznya.quarkus.reactive.querier.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class QuarkusReactiveQuerierResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/quarkus-reactive-querier")
                .then()
                .statusCode(200)
                .body(is("Hello quarkus-reactive-querier"));
    }
}
