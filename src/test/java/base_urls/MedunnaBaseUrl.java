package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.AuthenticationMedunna;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){

        spec= new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization",
                        "Bearer "+ AuthenticationMedunna.generateToken())

                .setBaseUri("https://medunna.com").build();

    }

}