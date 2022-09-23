package decorator.item;

import decorator.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super.description = "하우스블랜드(0.89)";
	}

	@Override
	public double cost() {
		double cost = .89;
		return cost;
	}
}
