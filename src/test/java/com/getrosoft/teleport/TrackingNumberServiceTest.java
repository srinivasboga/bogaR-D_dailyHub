package com.getrosoft.teleport;

import com.getrosoft.teleport.service.TrackingNumberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrackingNumberServiceTest {
	
	@InjectMocks
	private TrackingNumberService trackingNumberService;
	
	private static final String TRACKING_NUMBER_REGEX = "^[A-Z0-9]{1,16}$";
	private static final int NUM_TRACKING_NUMBERS = 1000;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void testGenerateTrackingNumber() {
		Set<String> generatedTrackingNumbers = new HashSet<>();
		
		for (int i = 0; i < NUM_TRACKING_NUMBERS; i++) {
			String result = String.valueOf(trackingNumberService.generateTrackingNumber());
			
			assertNotNull(result);
			assertNotNull(result);
			assertTrue(result.matches(TRACKING_NUMBER_REGEX),
					"Tracking number does not match the expected pattern");
			
			assertTrue(generatedTrackingNumbers.add(result),
					"Duplicate tracking number found: " + result);
		}
	}
}
