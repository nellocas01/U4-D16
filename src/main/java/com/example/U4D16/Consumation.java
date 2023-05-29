package com.example.U4D16;

public abstract class Consumation {
	String productName = "";

	public String getProductName() {
		return productName;
	}

	public abstract double getPrice();

	public abstract int getCalories();
}