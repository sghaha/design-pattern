package decorator.condiment;

import decorator.Beverage;

public class Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "+ 휘핑크림(0.1	)";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
