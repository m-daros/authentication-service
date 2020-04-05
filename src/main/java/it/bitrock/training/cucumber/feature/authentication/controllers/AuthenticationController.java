package it.bitrock.training.cucumber.feature.authentication.controllers;

import it.bitrock.training.cucumber.feature.authentication.model.AuthenticationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

	private static final Logger LOGGER = LoggerFactory.getLogger ( AuthenticationController.class );

	@RequestMapping ( path = "/login", method = RequestMethod.GET )
	@ResponseBody
	public ResponseEntity<AuthenticationResponse> login ( @RequestParam ( name = "username" ) String username, @RequestParam ( name = "password" ) String password ) {

		LOGGER.info ( "Required login with username: {} and password: {}", username, password );

		return new ResponseEntity<AuthenticationResponse> ( new AuthenticationResponse ( "Logged" ), HttpStatus.OK );
	}
}