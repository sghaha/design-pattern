package decorator;

import decorator.condiment.Mocha;
import decorator.condiment.Whip;
import decorator.item.Espresso;
import decorator.item.HouseBlend;

public class Main {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		System.out.println("=====");

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
		System.out.println("=====");





	}
}
