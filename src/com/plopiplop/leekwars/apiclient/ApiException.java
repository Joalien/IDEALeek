package com.plopiplop.leekwars.apiclient;

public class ApiException extends Throwable {

	public ApiException(String method, String url, String params, String errorMessage) {
		super(String.format("Error %s while calling API using %s (url=%s, params=%s)", errorMessage, method, url, params));
	}
}
