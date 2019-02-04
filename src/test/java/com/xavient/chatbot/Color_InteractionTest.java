package com.xavient.chatbot;

import static io.restassured.RestAssured.given;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Color_InteractionTest extends BaseE2ETest {
	
@Test
	public void color() throws Throwable {
		final String endPoint = testProperties.get("endPoint");
		RestAssured.baseURI = endPoint;
		 //String Expected_color_intent = (testProperties.get("Expected_color_intent"));
		ExcelDataConfig excel = new ExcelDataConfig(testProperties.get("excelPath"));
		System.out.println("the excel data is:"+excel.getdata(0, 1, 1));
		//excel.writeData(0, 1, 14,"vidya");
		
		
	        // Create new JSON Object
	        JsonObject intent = new JsonObject();
	        intent.addProperty("bot_id", Integer.parseInt(testProperties.get("bot_id")));
	        intent.addProperty("language_id", testProperties.get("language_id"));
	        intent.addProperty("context_id", Integer.parseInt(testProperties.get("context_id")));
	        intent.addProperty("jid", testProperties.get("jid"));
	        intent.addProperty("message_id", Integer.parseInt(testProperties.get("message_id")));
	        intent.addProperty("session_id", testProperties.get("session_id"));
	         for(int i=1; i<excel.rowCount();i++) {
	        	intent.addProperty("text", excel.getdata(0, i, 1));	        
	 	        System.out.println("------------" + intent);
	 	       String response = given().headers("Content-Type", "application/json")
	 					.headers("api_key", testProperties.get("api_key"))
	 					.body(intent).post("/genbot/bot/process").body()
	 					.jsonPath().getString("intent");

	 			System.out.println("------------" + response);
	 	        intent.remove("text");
	 	        System.out.println("------------" + intent);
	 	     
	 	       
	         }
	        
	        
	        
	        
	        

// for testing the question1 in the intent color//
		/*try {
			if (readFileContent(getGenericFileName("color1")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color1"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color1"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				
				
				System.out.println("the value is"+Expected_color_intent);
				
				
				if (intent.equalsIgnoreCase(Expected_color_intent)) {
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
				
			}
		} catch (IOException e) {
			
		}
//for testing the question2 in the intent color//
		try {
			if (readFileContent(getGenericFileName("color2")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color2"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color2"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_color_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}

		} catch (IOException e) {
			
		}
		
//for testing the question3 in the intent color//
		try {
			if (readFileContent(getGenericFileName("color3")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color3"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color3"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_color_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

//for testing the question4 in the intent color//
		try {
			if (readFileContent(getGenericFileName("color4")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color4"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color4"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_color_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}
// for testing the question5 in the intent color//
		try {
			if (readFileContent(getGenericFileName("color5")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color5"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color5"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_color_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}

// for testing the question6 in the intent color//
		try {
			if (readFileContent(getGenericFileName("color6")) != null) {
				String response = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color6"))).post("/genbot/bot/process").body()
						.toString();

				String intent = given().headers("Content-Type", "application/json")
						.headers("api_key", testProperties.get("api_key"))
						.body(readFileContent(getGenericFileName("color6"))).post("/genbot/bot/process").body()
						.jsonPath().getString("intent");

				System.out.println("------------" + intent);
				if (intent.equalsIgnoreCase(Expected_color_intent)){
					count++;
					//System.out.println("count=" + count);
				} else {
					//System.out.println("negative intent");
				}
			}
		} catch (IOException e) {
			
		}



		
		
//the Final Count value for the intent color
		System.out.println("Final count=" + count);
		if(count>=6) {
			System.out.println("The Test color intent is passed");
		}
		else {
			System.out.println("The Test color intent is Failed");
		}*/
		
	}

}

