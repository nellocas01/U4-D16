package drinks;

import com.example.U4D16.Consumation;

public class Wine extends Consumation {

	@Override
	public String getProductName() {
		return "Wine(0.75l, 13%)";
	}

	public int getCalories() {
		return 607;
	}

	public double getPrice() {
		return 7.49;
	}

}
