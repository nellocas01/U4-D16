package drinks;

import com.example.U4D16.Consumation;

public class Lemonade extends Consumation {

	@Override
	public String getProductName() {
		return "Lemonade(0.33l)";
	}

	public int getCalories() {
		return 128;
	}

	public double getPrice() {
		return 1.29;
	}

}
