package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, String> {

	public String handleRequest(Object input, Context context) {
	  context.getLogger().log("Input: " + input);
	  String output = "Hello, good day " + input + "!";
	  String output = "Hello, good day " + input "!"; //fail build
	  return output;
	}

	

}
