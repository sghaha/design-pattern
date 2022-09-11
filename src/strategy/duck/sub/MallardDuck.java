package strategy.duck.sub;

import strategy.duck.Duck;
import strategy.fly.FlyBehavior;
import strategy.fly.FlyWithWings;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;

//Mallard : 청동오리
public class MallardDuck extends Duck {

	public MallardDuck() {
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("청동오리의 생김새");
	}


}
