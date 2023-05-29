package pizza;

import com.example.U4D16.Consumation;
import com.example.U4D16.ExtraAdditionDecorator;

public class SalamiPizzaDecorator extends ExtraAdditionDecorator {
	public SalamiPizzaDecorator(Consumation consumation) {
		this.consumation = consumation;
	}

	@Override
	public String getProductName() {
		return "Salami Pizza(tomato, cheese) with extra salami";
	}

	public double getPrice() {
		return consumation.getPrice() + 1.00;
	}

	public int getCalories() {
		return consumation.getCalories() + 56;
	}

}
