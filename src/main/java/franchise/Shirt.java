package franchise;

import com.example.U4D16.Consumation;

public class Shirt extends Consumation {

	@Override
	public String getProductName() {
		return "Shirt";
	}

	public double getPrice() {
		return 21.99;
	}

	public int getCalories() {
		return 0;
	}
}
