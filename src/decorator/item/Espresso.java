package decorator.item;

import decorator.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		super.description = "에스프레소(1.99)";
	}

	@Override
	public double cost() {
		double cost = 1.99;
		return cost;
	}
}
