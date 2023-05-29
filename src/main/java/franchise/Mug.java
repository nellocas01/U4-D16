package franchise;

import com.example.U4D16.Consumation;

public class Mug extends Consumation {

	@Override
	public String getProductName() {
		return "Mug";
	}

	public double getPrice() {
		return 4.99;
	}

	public int getCalories() {
		return 0;
	}

}
