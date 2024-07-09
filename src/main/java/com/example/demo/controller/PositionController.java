//package com.example.controller;
//
//import org.springframework.lang.NonNull;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import com.example.model.Aircraft;
//
//import lombok.RequiredArgsConstructor;
//
//@RequiredArgsConstructor
//@Controller
//public class PositionController {
//	@NonNull
//	private final Aircraft aircraft;
//	private WebClient client = WebClient.create("http://localhost:7634/aircraft");
//	
//	@GetMapping("/aircraft")
//	public String getCurrentAircraftPositions(Model model) {
//		aircraft.deleteAll();
//	}
//	
//}


