package rest.api;

import org.junit.Assert;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class GetData {
	String url = "http://api.openweathermap.org/data/2.5/weather?lat=14.6615&lon=120.9432&appid=c7d778d1ee4dba65a8d3d8bdf2c89bdb";

//	#REST API
//	http://api.openweathermap.org/data/2.5/weather?lat=14.6615&lon=120.9432&appid=c7d778d1ee4dba65a8d3d8bdf2c89bdb
//	lat=14.6615
//	lon=120.9432
//	appid=c7d778d1ee4dba65a8d3d8bdf2c89bdb
	
	
	
	@Test
	@Step
	public void testResponseCode() {
		get(url).then().assertThat().statusCode(200).and().body("name", is("Navotas"));
	}

	@Test
	@Step
	public void testResponseCode1() {
		String url = "http://api.openweathermap.org/data/2.5/weather?lat=14.6615&lon=120.9432&appid=c7d778d1ee4dba65a8d3d8bdf2c89bdb";

		Response response = get(url);

		int code = response.getStatusCode();

		System.out.println("status code " + code + response.asString());

		Assert.assertEquals(200, code);

	}

}
