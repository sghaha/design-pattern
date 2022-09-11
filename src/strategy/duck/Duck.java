package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public Duck() {
	}

	public void swim() {
		System.out.println("모든오리는 뜹니다. 가짜오리도 뜹니다.");
	}

	public abstract void display();


	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
