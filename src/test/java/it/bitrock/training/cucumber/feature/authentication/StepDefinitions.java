package it.bitrock.training.cucumber.feature.authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.junit.Before;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;

public class StepDefinitions extends AbstractSpringIntegrationTest {

	private String registeredUsername;
	private String registeredPassword;
	private String answer;

	@Before
	public void setup () {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port    = 8080;
	}

	@Given ( "my username is {string}" )
	public void my_username_is ( String username ) {

		this.registeredUsername = username;
	}

	@Given ( "my password is {string}" )
	public void my_password_is ( String password ) {

		this.registeredPassword = password;
	}

	@When ( "I login with username {string} and password {string}" )
	public void i_login_with_username_and_password ( String username, String password ) {

		answer = given ()
				.param ( "username", username )
				.param ( "password", password )
				.when ()
				.get ( "/login" )
				.then ()
				.statusCode ( 200 )
				.contentType ( JSON )
				.extract ()
				.path ( "status" );
	}

	@Then ( "the application says {string}" )
	public void the_application_says ( String expectedAnswer ) {

		assertEquals ( expectedAnswer, answer );
	}
}