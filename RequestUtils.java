package utils;

import play.mvc.Result;

public class RequestUtils {

	public static Result prepResponse(Result input){
		return input.withHeader("Access-Control-Allow-Origin","*");
	}
	
}
