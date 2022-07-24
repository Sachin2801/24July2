package RestAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/api/users/10";
//	RestAssured.baseURI="http://localhost:3000/posts/2";
	RequestSpecification http=RestAssured.given();
	Response resp=http.get();
	System.out.println(resp.getBody().asString());
	System.out.println(resp.getStatusCode());
	System.out.println(resp.getStatusLine());
	System.out.println(resp.headers());
	System.out.println(resp.getTime());
	
	
	}
}
