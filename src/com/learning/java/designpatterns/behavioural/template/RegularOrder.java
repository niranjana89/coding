package com.learning.java.designpatterns.behavioural.template;

public class RegularOrder extends OrderPurchase {

	@Override
	public void provideDeliveryAddress() {
		System.out.println("Please enter the delivery address for which the items to be delivered to");
	}

	@Override
	public void selectPayment() {
		System.out.println("Provide your payment type and continue from here");
	}

}
