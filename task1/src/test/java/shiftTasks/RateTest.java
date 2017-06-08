package shiftTasks;


import com.jayway.restassured.RestAssured;
import org.junit.Test;

import static com.jayway.restassured.config.JsonConfig.jsonConfig;
import static com.jayway.restassured.path.json.config.JsonPathConfig.NumberReturnType.BIG_DECIMAL;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by badiere.eric on 6/7/17.
 */
public class RateTest {

    @Test
    public void testBtcToLtcPairValue(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/rate/btc_ltc").
                       then().
                       assertThat().statusCode(200).
                       body("pair", is("btc_ltc"));
    }

    @Test
    public void testBtcToLtcRateHasValue(){
        RestAssured
            .given().accept("application/json").config(RestAssured.config().
            jsonConfig(jsonConfig().numberReturnType(BIG_DECIMAL))).
            when().get("https://shapeshift.io/rate/btc_ltc").
                then().
                assertThat().statusCode(200).
                body("rate", notNullValue());
        // This can be enhanced to validate all rate against a source of truth.
    }

    @Test
    public void testEthToBtcPairValue(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/rate/eth_btc").
                       then().
                       assertThat().statusCode(200).
                       body("pair", is("eth_btc"));

    }

    @Test
    public void testReturnAllValues(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/rate/").
                       then().
                       assertThat().statusCode(200);
        // This can be enhanced to validate all values against a source of truth.

    }

    @Test
    public void testIncompletePair(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/rate/z").
                       then().
                       assertThat().statusCode(200).
                       body("error", equalTo("Unknown pair"));
    }

    @Test
    public void testBadPair(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/rate/zzz_ppp").
                       then().
                       assertThat().statusCode(200).
                       body("error", equalTo("Unknown pair"));
    }

    @Test
    public void testSqlInjectionHackyStuff(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/rate/’%20or%20’1’=’1").
                       then().
                       assertThat().statusCode(200).
                       body("error", equalTo("Unknown pair"));
    }



}
