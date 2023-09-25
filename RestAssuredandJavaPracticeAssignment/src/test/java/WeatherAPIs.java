import static  io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class WeatherAPIs {
	
	int data;
	@Test
	void weatherreport() {
	given()
	
	.when()
	 .get("https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22")
	.then()
	 .statusCode(data)
	 .log().all();
	
	}
}
