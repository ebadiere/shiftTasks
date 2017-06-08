package shiftTasks;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

/**
 * Created by badiere.eric on 6/7/17.
 */
public class TransactionsListTest {

    @Test
    public void testGetRecentTransationsDefault(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(5));
    }

    @Test
    public void testGetRecentTransationsMax(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/50").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(50));
    }

    @Test
    public void testGetRecentTransationsOverMax(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/51").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(50));
    }

    @Test
    public void testGetRecentTransationsWithValue0(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/0").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(5));
    }

    @Test
    public void testGetRecentTransationsWithValueNegativeOne(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/-1").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(5));
    }
    @Test
    public void testGetRecentTransationsWithALotOfNines(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/9999999999").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(50));
    }
    @Test
    public void testGetRecentTransationsWithADecimalValue(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/27.4").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(27));
    }

    @Test
    public void testGetRecentTransationsWithADecimalValueGreaterThanFive(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/27.6").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(27));
    }

    @Test
    public void testGetRecentTransationsWithSqlInjectionHackyStuff(){
        RestAssured.given().accept("application/json").
            when().get("https://shapeshift.io/recenttx/’%20or%20’1’=’1").
                       then().
                       assertThat().statusCode(200).
                       body("size()", is(5));
    }
}
