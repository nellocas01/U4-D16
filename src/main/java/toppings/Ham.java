package toppings;

import com.example.U4D16.Consumation;

public class Ham extends Consumation {

	@Override
	public String getProductName() {
		return "Ham";
	}

	public int getCalories() {
		return 35;
	}

	public double getPrice() {
		return 0.99;
	}

}
