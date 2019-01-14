package com.xavient.chatbot.e2etests;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.junit.Test;

import io.restassured.RestAssured;

public class Billing_InteractionTest extends BaseE2ETest {

	@Test
	public void billing() throws IOException, Exception {
		final String endPoint = testProperties.get("endPoint");
		RestAssured.baseURI = endPoint;

		try {
			if (readFileContent(getGenericFileName("billing_request1")) != null) {
				String response = given().headers("Content-Type", "application/json").headers("api_key",testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("billing_request1")))
						.post("/genbot/bot/process").body().toString();
			
			String intent =	given().headers("Content-Type", "application/json").headers("api_key",testProperties.get("api_key"))
				.body(readFileContent(getGenericFileName("billing_request1")))
				.post("/genbot/bot/process").body().jsonPath().getString("intent");
			
			System.out.println("------------"+intent);
			}
		} catch (IOException e) {
			// We are not running E2E Tests in STG and PRD Environments
		}

	}
		
}
