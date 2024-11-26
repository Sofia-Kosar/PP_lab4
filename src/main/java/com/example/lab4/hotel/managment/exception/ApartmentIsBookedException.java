package com.example.lab4.hotel.managment.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class ApartmentIsBookedException extends RuntimeException {
	private final int status;
	private final String message;
	private final Date timestamp;

	public ApartmentIsBookedException(int status, String message) {
		this.status = status;
		this.message = message;
		this.timestamp = new Date();
	}
}