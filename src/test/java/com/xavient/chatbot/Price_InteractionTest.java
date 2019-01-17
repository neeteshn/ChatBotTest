package com.xavient.chatbot;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import org.junit.Test;
import io.restassured.RestAssured;

public class Price_InteractionTest extends BaseE2ETest {
	
@Test
	public void price() throws IOException, Exception {
		final String endPoint = testProperties.get("endPoint");
		RestAssured.baseURI = endPoint;
		 String Expected_price_intent = (testProperties.get("Expected_price_intent"));
		
		

// for testing the question1 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price1")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price1"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price1"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				
				
				System.out.println("the value is"+Expected_price_intent);
				
				
				if (intent.equalsIgnoreCase(Expected_price_intent)) {
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
				
			}
		} catch (IOException e) {
			
		}
//for testing the question2 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price2")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price2"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price2"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}

		} catch (IOException e) {
			
		}
		
//for testing the question3 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price3")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price3"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price3"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

//for testing the question4 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price4")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price4"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price4"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question5 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price5")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price5"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price5"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question6 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price6")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price6"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price6"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question7 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price7")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price7"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price7"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
		
		}

// for testing the question8 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price8")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price8"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price8"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question9 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price9")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price9"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price9"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question10 in the intent price//
		try {
			if (readFileContent(getGenericFileName("price10")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price10"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("price10"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_price_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
		
		
//the Final Count value for the intent price
		System.out.println("Final count=" + count);
		if(count>=6) {
			System.out.println("The Test price intent is passed");
		}
		else {
			System.out.println("The Test price intent is Failed");
		}
		
	}

}
