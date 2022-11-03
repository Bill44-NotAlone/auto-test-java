import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class RequestTest {

    public String baseUrl;

    @BeforeClass
    public void postInit(){
        baseUrl = "https://reqres.in/";
    }

    @Test
    @DisplayName("Создание пользователя")
    public void createUser(){
        given()
                .baseUri(baseUrl)
                .basePath("api/users")
                .contentType(ContentType.JSON)
                .body("{\"name\":\"morpheus\", \"job\": \"leader\"}")
                .when().post()
                .then().statusCode(201)
                .log().all();
    }
}
