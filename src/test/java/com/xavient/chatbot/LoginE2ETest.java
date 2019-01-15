package com.xavient.chatbot;




import java.io.IOException;

import org.junit.Test;

/*import org.testng.annotations.Test;*/

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class LoginE2ETest extends BaseE2ETest{

	
	@Test
	public void login() throws IOException, Exception {
		final String endPoint = testProperties.get("endPoint");
		RestAssured.baseURI = endPoint;

		try {
			if (readFileContent(getGenericFileName("login.json")) != null) {
				given().headers("Content-Type", "application/json")
						.body(readFileContent(getGenericFileName("login.json")))
						.post("/api/account/login").then().assertThat().statusCode(200);
			}
		} catch (IOException e) {
			// We are not running E2E Tests in STG and PRD Environments
		}

	}
		
}
