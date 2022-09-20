package decorator.item;

import decorator.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		super.description = "에스프레소(1.99)";
	}

	@Override
	public double cost() {
		double cost = 1.99;
		switch (super.getSize()) {
			case GRANDE:
				cost += 0.1;
				break;
			case VENTI:
				cost += 0.2;
				break;
			default:
				break;
		}
		return cost;
	}
}
