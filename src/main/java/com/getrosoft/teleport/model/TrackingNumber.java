package com.getrosoft.teleport.model;

import lombok.Data; // Import Lombok Data
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

@Entity
@Data
public class TrackingNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String trackingNumber;
	private Instant createdAt;
}
