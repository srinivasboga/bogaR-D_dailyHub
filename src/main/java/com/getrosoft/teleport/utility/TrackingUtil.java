// src/main/java/com/teleport/util/TrackingUtil.java
package com.getrosoft.teleport.utility;

import java.util.UUID;

public class TrackingUtil {
	
	public static String generateUniqueTrackingNumber() {
		return UUID.randomUUID().toString()
				.replace("-", "")
				.substring(0, 16)
				.toUpperCase();
	}
}
