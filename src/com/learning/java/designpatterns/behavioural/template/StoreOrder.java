package com.learning.java.designpatterns.behavioural.template;

public class StoreOrder extends OrderPurchase {

	@Override
	public void provideDeliveryAddress() {
		System.out.println("<store pickup> Select the nearest store");
	}

	@Override
	public void selectPayment() {
		System.out.println("Do you want to pay at the store ? ");
	}

}
