import java.util.Scanner;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WeatherAPIUsingJava {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\nChoose an option:");
		            System.out.println("1. Get Temperature");
		            System.out.println("2. Get Wind Speed");
		            System.out.println("3. Get Pressure");
		            System.out.println("0. Exit");

		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    getTemperature();
		                    break;
		                case 2:
		                    getWindSpeed();
		                    break;
		                case 3:
		                    getPressure();
		                    break;
		                case 0:
		                    System.out.println("Exiting program.");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please select a valid option.");
		            }
		        }
		    }

		    private static void getTemperature() {
		        Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22");
		        double temperature = response.jsonPath().getDouble("list[0].main.temp");
		        System.out.println("Temperature in London: " + temperature + "°K");
		    }

		    private static void getWindSpeed() {
		        Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22");
		        double windSpeed = response.jsonPath().getDouble("list[0].wind.speed");
		        System.out.println("Wind Speed in London: " + windSpeed + " m/s");
		    }

		    private static void getPressure() {
		        Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22");
		        double pressure = response.jsonPath().getDouble("list[0].main.pressure");
		        System.out.println("Pressure in London: " + pressure + " hPa");
		    }
		

	        }
	    
	
	






		
		
	


