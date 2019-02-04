package com.xavient.chatbot;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import org.junit.Test;
import io.restassured.RestAssured;

public class Device_InteractionTest extends BaseE2ETest {
	
@Test
	public void device() throws IOException, Exception {
		final String endPoint = testProperties.get("endPoint");
		RestAssured.baseURI = endPoint;
		 String Expected_device_intent = (testProperties.get("Expected_device_intent"));
		
		

// for testing the question1 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device1")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device1"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device1"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				
				
				System.out.println("the value is"+Expected_device_intent);
				
				
				if (intent.equalsIgnoreCase(Expected_device_intent)) {
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
				
			}
		} catch (IOException e) {
			
		}
//for testing the question2 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device2")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device2"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device2"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}

		} catch (IOException e) {
			
		}
		
//for testing the question3 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device3")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device3"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device3"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

//for testing the question4 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device4")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device4"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device4"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question5 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device5")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device5"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device5"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question6 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device6")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device6"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device6"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question7 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device7")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device7"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device7"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
		
		}

// for testing the question8 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device8")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device8"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device8"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question9 in the intent device//
		try {
			if (readFileContent(getGenericFileName("device9")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device9"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("device9"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_device_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}


		
		
//the Final Count value for the intent device
		System.out.println("Final count=" + count);
		if(count>=6) {
			System.out.println("The Test device intent is passed");
		}
		else {
			System.out.println("The Test device intent is Failed");
		}
		
	}

}
