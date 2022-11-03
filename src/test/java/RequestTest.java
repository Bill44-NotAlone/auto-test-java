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
    @DisplayName("Получения списка пользователей 2 страници")
    public void listUsers(){
        given()
                .baseUri(baseUrl)
                .basePath("/api/users?page=2")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
    }
}
