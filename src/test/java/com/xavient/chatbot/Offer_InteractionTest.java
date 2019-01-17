package com.xavient.chatbot;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import org.junit.Test;
import io.restassured.RestAssured;

public class Offer_InteractionTest extends BaseE2ETest {
	
@Test
	public void offer() throws IOException, Exception {
		final String endPoint = testProperties.get("endPoint");
		RestAssured.baseURI = endPoint;
		 String Expected_offer_intent = (testProperties.get("Expected_offer_intent"));
		
		

// for testing the question1 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer1")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer1"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer1"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				
				
				System.out.println("the value is"+Expected_offer_intent);
				
				
				if (intent.equalsIgnoreCase(Expected_offer_intent)) {
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
				
			}
		} catch (IOException e) {
			
		}
//for testing the question2 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer2")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer2"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer2"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}

		} catch (IOException e) {
			
		}
		
//for testing the question3 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer3")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer3"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer3"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

//for testing the question4 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer4")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer4"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer4"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question5 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer5")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer5"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer5"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question6 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer6")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer6"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer6"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question7 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer7")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer7"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer7"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
		
		}

// for testing the question8 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer8")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer8"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer8"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question9 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer9")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer9"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer9"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question10 in the intent offer//
		try {
			if (readFileContent(getGenericFileName("offer10")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer10"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("offer10"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_offer_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
		
		
//the Final Count value for the intent Offer
		System.out.println("Final count=" + count);
		if(count>=6) {
			System.out.println("The Test Offer intent is passed");
		}
		else {
			System.out.println("The Test Offer intent is Failed");
		}
		
	}

}
