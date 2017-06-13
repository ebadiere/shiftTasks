package shiftTasks;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by badiere.eric on 6/13/17.
 */
public class ShiftTest {
    @Test
    public void testFailingPost(){
        String examplePost = "{\"withdrawal\":\"AAAAAAAAAAAAA\", \"pair\":\"btc_ltc\", \"returnAddress\":\"BBBBBBBBBBB\"}";

        given()
            .accept("application/json")
            .contentType("application/json")
            .body(examplePost)
            .when().post("https://shapeshift.io/shift").then()
            .statusCode(200).body("error", equalTo("Warning: Return address appears to be invalid for the deposit coin type."));


    }

}
