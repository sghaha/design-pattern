package strategy.duck.sub;

import strategy.duck.Duck;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyWithWings;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;
import strategy.quack.Squeak;

//러버덕
public class RubberDuck extends Duck {

	public RubberDuck() {
		super.quackBehavior = new Squeak();
		super.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("러버덕의 생김새");
	}

}
