package decorator.condiment;

import decorator.Beverage;

public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "+ 모카(0.2)";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
