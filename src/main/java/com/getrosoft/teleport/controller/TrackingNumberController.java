package com.getrosoft.teleport.controller;

import com.getrosoft.teleport.service.TrackingNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TrackingNumberController {
	@Autowired
	private TrackingNumberService service;
	
	@GetMapping("/next-tracking-number")
	public ResponseEntity<Map<String, String>> getNextTrackingNumber(
			@RequestParam String origin_country_id,
			@RequestParam String destination_country_id,
			@RequestParam double weight,
			@RequestParam String created_at,
			@RequestParam String customer_id,
			@RequestParam String customer_name,
			@RequestParam String customer_slug) {
		
		String trackingNumber = String.valueOf(service.generateTrackingNumber());
		Map<String, String> response = new HashMap<>();
		response.put("tracking_number", trackingNumber);
		response.put("created_at", Instant.now().toString());
		
		return ResponseEntity.ok(response);
	}
}
