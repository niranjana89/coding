package com.learning.java.designpatterns.behavioural.template;

public abstract class OrderPurchase {

	public final void purchase(){
		addToCart();
		provideDeliveryAddress();
		selectPayment();
		reviewOrder();
		confirmOrder();
	}

	private void confirmOrder() {
		System.out.println("The order is placed!!!");
	}

	private void reviewOrder() {
		System.out.println("Carefully review your order before confirming!!!");
	}

	private void addToCart() {
		System.out.println("Items added to cart");
	}

	public abstract void provideDeliveryAddress();

	public abstract void selectPayment(); 
}
