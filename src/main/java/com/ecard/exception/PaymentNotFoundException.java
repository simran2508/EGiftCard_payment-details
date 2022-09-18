package com.ecard.exception;

public class PaymentNotFoundException extends Exception {
	
	public String toString(PaymentNotFoundException e) {
		return "payment not found";
	}

}
