package pizza;

import com.example.U4D16.Consumation;
import com.example.U4D16.ExtraAdditionDecorator;

public class FamilyPizzaDecorator extends ExtraAdditionDecorator {
	public FamilyPizzaDecorator(Consumation consumation) {
		this.consumation = consumation;
	}

	@Override
	public String getProductName() {
		return "Family Size for Pizza";
	}

	public double getPrice() {
		return 4.15;
	}

	public int getCalories() {
		return 2;
	}

}
