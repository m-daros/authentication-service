package it.bitrock.training.cucumber.feature.authentication.controllers;

import it.bitrock.training.cucumber.feature.authentication.model.AuthenticationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

	private static final Logger LOGGER = LoggerFactory.getLogger ( AuthenticationController.class );

	private Map<String, String> registeredUsers;

	public AuthenticationController () {

		registeredUsers = new HashMap<> ();
		registeredUsers.put ( "pippo", "pippo-pwd" );
		registeredUsers.put ( "pluto", "pluto-pwd" );
	}

	@RequestMapping ( path = "/login", method = RequestMethod.GET )
	@ResponseBody
	public ResponseEntity<AuthenticationResponse> login ( @RequestParam ( name = "username" ) String username, @RequestParam ( name = "password" ) String password ) {

		LOGGER.info ( "Required login with username: {} and password: {}", username, password );

		String userPassword = registeredUsers.get ( username );

		if ( null != userPassword && userPassword.equals ( password ) ) {

			return new ResponseEntity<AuthenticationResponse> ( new AuthenticationResponse ( "Logged" ), HttpStatus.OK );
		}
		else {

			return new ResponseEntity<AuthenticationResponse> ( new AuthenticationResponse ( "Unable to login" ), HttpStatus.OK );
		}
	}
}