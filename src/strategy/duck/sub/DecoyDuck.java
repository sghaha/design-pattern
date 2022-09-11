package strategy.duck.sub;

import strategy.duck.Duck;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;

//오리 모형
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super.quackBehavior = new MuteQuack();
		super.flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("오리모형의 생김새");
	}
}
