package com.example.U4D16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import drinks.Lemonade;
import drinks.Water;
import drinks.Wine;
import franchise.Mug;
import franchise.Shirt;
import lombok.extern.slf4j.Slf4j;
import pizza.FamilyPizzaDecorator;
import pizza.HawaiianPizzaDecorator;
import pizza.Pizzas;
import pizza.SalamiPizzaDecorator;
import toppings.Cheese;
import toppings.Ham;
import toppings.Onions;
import toppings.Pineapple;
import toppings.Salami;

@SpringBootApplication
@Slf4j
public class U4D16Application {

	public static void main(String[] args) {
		SpringApplication.run(U4D16Application.class, args);
		// 1
		log.info("Godfather's Pizza Menù!");

		// 2
		// margherita
		Consumation margherita = new Pizzas();
		log.info("Pizza: " + margherita.getProductName() + " calorie: " + margherita.getCalories() + " prezzo "
				+ margherita.getPrice());

		// hawaiiana
		Consumation hawaii = new HawaiianPizzaDecorator(margherita);
		log.info("Pizza: " + hawaii.getProductName() + " calorie " + hawaii.getCalories() + " prezzo "
				+ hawaii.getPrice());

		// salami
		Consumation salami = new SalamiPizzaDecorator(margherita);
		log.info("Pizza: " + salami.getProductName() + " calorie " + salami.getCalories() + " prezzo "
				+ salami.getPrice());

		// family
		Consumation family = new FamilyPizzaDecorator(margherita);
		log.info("Pizza: " + family.getProductName() + " calorie x" + family.getCalories() + " prezzo +"
				+ family.getPrice());

		// toppings
		log.info("Godfather's Pizza Menù Toppings!");

		// cheese
		Consumation cheese = new Cheese();
		log.info("Topping: " + cheese.getProductName() + " calorie " + cheese.getCalories() + " prezzo "
				+ cheese.getPrice());

		// ham
		Consumation ham = new Ham();
		log.info("Topping: " + ham.getProductName() + " calorie " + ham.getCalories() + " prezzo " + ham.getPrice());

		// onions
		Consumation onions = new Onions();
		log.info("Topping: " + onions.getProductName() + " calorie " + onions.getCalories() + " prezzo "
				+ onions.getPrice());

		// pineapple
		Consumation pineapple = new Pineapple();
		log.info("Topping: " + pineapple.getProductName() + " calorie " + pineapple.getCalories() + " prezzo "
				+ pineapple.getPrice());

		// salame
		Consumation salame = new Salami();
		log.info("Topping: " + salame.getProductName() + " calorie " + salame.getCalories() + " prezzo "
				+ salame.getPrice());

		// drinks
		log.info("Godfather's Pizza Menù Drinks!");

		// lemon
		Consumation lemon = new Lemonade();
		log.info("Drinks: " + lemon.getProductName() + " calorie " + lemon.getCalories() + " prezzo "
				+ lemon.getPrice());

		// water
		Consumation water = new Water();
		log.info("Drinks: " + water.getProductName() + " calorie " + water.getCalories() + " prezzo "
				+ water.getPrice());

		// wine
		Consumation wine = new Wine();
		log.info("Drinks: " + wine.getProductName() + " calorie " + wine.getCalories() + " prezzo " + wine.getPrice());

		// franchise
		log.info("Godfather's Pizza Franchise!");

		// shirt
		Consumation shirt = new Shirt();
		log.info("Drinks: " + shirt.getProductName() + " prezzo " + shirt.getPrice());

		// mug
		Consumation mug = new Mug();
		log.info("Drinks: " + mug.getProductName() + " prezzo " + mug.getPrice());
	}

}
