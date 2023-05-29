package pizza;

import com.example.U4D16.Consumation;
import com.example.U4D16.ExtraAdditionDecorator;

public class HawaiianPizzaDecorator extends ExtraAdditionDecorator {
	public HawaiianPizzaDecorator(Consumation consumation) {
		this.consumation = consumation;
	}

	@Override
	public String getProductName() {
		return "Hawaiian Pizza(tomato, cheese) with extra ham and pineapple";
	}

	public double getPrice() {
		return consumation.getPrice() + 1.50;
	}

	public int getCalories() {
		return consumation.getCalories() - 80;
	}

}
