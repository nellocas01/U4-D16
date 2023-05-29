package toppings;

import com.example.U4D16.Consumation;

public class Cheese extends Consumation {

	@Override
	public String getProductName() {
		return "Cheese";
	}

	public int getCalories() {
		return 92;
	}

	public double getPrice() {
		return 0.69;
	}

}
