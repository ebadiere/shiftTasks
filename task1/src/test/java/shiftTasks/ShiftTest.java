package shiftTasks;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by badiere.eric on 6/13/17.
 */
public class ShiftTest {
    @Test
    public void testFailingPost(){
        String examplePost = "{\"withdrawal\":\"AAAAAAAAAAAAA\", \"pair\":\"btc_ltc\", returnAddress:\"BBBBBBBBBBB\"}";

        given()
            .contentType("application/json")
            .body(examplePost)
            .when().post("https://shapeshift.io/shift").then()
            .statusCode(200);


    }

}
