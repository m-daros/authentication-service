package it.bitrock.training.cucumber.feature.authentication.model;


public class AuthenticationResponse {

	private String status;


	public AuthenticationResponse () {

	}

	public AuthenticationResponse ( String status ) {

		this.status = status;
	}

	public String getStatus () {

		return status;
	}

	public void setStatus ( String status ) {

		this.status = status;
	}
}