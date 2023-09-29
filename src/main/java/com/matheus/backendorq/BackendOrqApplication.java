package com.matheus.backendorq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import util.SignerTrx;

@SpringBootApplication
public class BackendOrqApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendOrqApplication.class, args);
		System.out.println("TIMESTAMP: " + SignerTrx.getTimestampString());
		System.out.println("HASH: " + SignerTrx.getSignature("GET", "/v1/portfolios", ""));
	}

}
