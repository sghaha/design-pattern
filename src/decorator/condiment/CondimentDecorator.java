package decorator.condiment;

import decorator.Beverage;
import decorator.enums.Size;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public abstract String getDescription();
}
