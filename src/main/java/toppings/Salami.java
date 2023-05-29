package toppings;

import com.example.U4D16.Consumation;

public class Salami extends Consumation {

	@Override
	public String getProductName() {
		return "Salami";
	}

	public int getCalories() {
		return 86;
	}

	public double getPrice() {
		return 0.99;
	}

}
