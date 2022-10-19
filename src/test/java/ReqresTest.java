import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ReqresTest {

    @Test
    @DisplayName("Получения списка пользователей 2 страници")
    public void listUsers(){
        given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=2")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200);
    }
}
