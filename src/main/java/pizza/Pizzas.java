package pizza;

import com.example.U4D16.Consumation;

public class Pizzas extends Consumation {

	@Override
	public String getProductName() {
		return "Pizza Margherita(tomato, cheese)";
	}

	public int getCalories() {
		return 1104;
	}

	public double getPrice() {
		return 4.99;
	}

}
