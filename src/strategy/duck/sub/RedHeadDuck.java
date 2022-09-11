package strategy.duck.sub;

import strategy.duck.Duck;
import strategy.fly.FlyBehavior;
import strategy.fly.FlyNoWay;
import strategy.fly.FlyWithWings;
import strategy.quack.MuteQuack;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;

//아메리카흰죽지 (Redhead)
public class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("아메리카흰죽지의 생김새");
	}

}
