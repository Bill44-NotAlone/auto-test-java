import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import prof.code.StepUser;

import static io.restassured.RestAssured.given;

public class RequestTest {
    public StepUser stepUser;

    @BeforeClass
    public void postInit(){
        stepUser = new StepUser();
    }

    @Test
    public void firstTest(){
        stepUser.createUser("name","job");
    }
}
