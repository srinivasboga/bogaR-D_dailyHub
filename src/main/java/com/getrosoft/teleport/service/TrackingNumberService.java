package com.getrosoft.teleport.service;

import com.getrosoft.teleport.model.TrackingNumber;
import com.getrosoft.teleport.repository.TrackingNumberRepository;
import com.getrosoft.teleport.utility.TrackingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TrackingNumberService {
	
	@Autowired
	private TrackingNumberRepository repository;
	
	public Optional<TrackingNumber> generateTrackingNumber() {
		String uniqueTrackingNumber = TrackingUtil.generateUniqueTrackingNumber();
		TrackingNumber trackingNumber = new TrackingNumber();
		trackingNumber.setTrackingNumber(uniqueTrackingNumber);
		trackingNumber.setCreatedAt(Instant.now());
		
		return Optional.of(repository.save(trackingNumber));
	}
}