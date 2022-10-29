import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ReqresTest {

    public String baseUrl;

    @BeforeClass
    public void postInit(){
        baseUrl = "https://reqres.in/";
    }

    @Test
    @DisplayName("Получения списка пользователей 2 страници")
    public void listUsers(){
        given()
                .baseUri(baseUrl)
                .basePath("/api/users?page=2")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
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
