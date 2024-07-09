//package com.example.demo.model;
//
//import java.time.Instant;
//
//import org.springframework.data.annotation.Id;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Aircraft {
//	
//	@Id
//	@GeneratedValue
//	private Long id;
//	private String callsign, squawk, reg, flightno, route, type, category;
//	private int altitude, heading, speed;
//	
//	@JsonProperty("vert_rate")
//	private int vertRate;
//	
//	@JsonProperty("selected_altitude")
//	private int selectedAltitude;
//	
//	private double lat, lon, barometer;
//	
//	@JsonProperty("polar_distance")
//	private double polarBearing;
//	
//	@JsonProperty("is_adsb")
//	private boolean isADSB;
//	
//	@JsonProperty("is_on_ground")
//	private boolean isOnGround;
//	
//	@JsonProperty("last_seen_time")
//	private Instant lastSeenTime;
//	
//	@JsonProperty("pos_update_time")
//	private Instant posUpdateTime;
//	
//	@JsonProperty("bds40_seen_time")
//	private Instant bds40SeenTime;
//
//	public Instant getLastSeenTime() {
//		return lastSeenTime;
//	}
//
//	public void setLastSeenTime(Instant lastSeenTime) {
//		this.lastSeenTime = lastSeenTime;
//	}
//
//	public Instant getPosUpdateTime() {
//		return posUpdateTime;
//	}
//
//	public void setPosUpdateTime(Instant posUpdateTime) {
//		this.posUpdateTime = posUpdateTime;
//	}
//
//	public Instant getBds40SeenTime() {
//		return bds40SeenTime;
//	}
//
//	public void setBds40SeenTime(Instant bds40SeenTime) {
//		this.bds40SeenTime = bds40SeenTime;
//	}
//	
//	
//}
