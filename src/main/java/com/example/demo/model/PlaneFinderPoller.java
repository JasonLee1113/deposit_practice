package com.example.demo.model;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import io.micrometer.common.lang.NonNull;
import lombok.RequiredArgsConstructor;

@EnableScheduling
@Component
@RequiredArgsConstructor
public class PlaneFinderPoller {
	
	@NonNull
//	private final AircraftRepository repository;
	
	private WebClient client = 
			WebClient.create("http://locolhost:7634/aircraft");
}
