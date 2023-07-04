package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {
    public static String generateToken(){
        String body = "{ \"username\" : \"mark_twain\",\"rememberMe\" : \"true\", \"password\" : \"Mark.123\" }";

        Response response = given().body(body).contentType(ContentType.JSON).post("https://medunna.com/api/authenticate");
        return response.jsonPath().getString("id_token");
    }
}
