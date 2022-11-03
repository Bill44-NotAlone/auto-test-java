package prof.code;

import io.restassured.http.ContentType;
import prof.code.models.UserRequestModel;
import prof.code.models.UserResponseModel;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiUser {
    public void createUser(UserRequestModel model) {
        UserResponseModel userResponseModel = given()
                .baseUri("https://reqres.in/")
                .basePath("api/users")
                .contentType(ContentType.JSON)
                .body(model)
                .post()
                .then()
                .statusCode(201)
                .log().all()
                .extract().as(UserResponseModel.class);
    }
}
