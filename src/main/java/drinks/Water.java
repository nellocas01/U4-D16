package drinks;

import com.example.U4D16.Consumation;

public class Water extends Consumation {

	@Override
	public String getProductName() {
		return "Water(0.5l)";
	}

	public int getCalories() {
		return 0;
	}

	public double getPrice() {
		return 1.29;
	}

}
