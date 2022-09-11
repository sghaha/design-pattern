package strategy;

import strategy.duck.Duck;
import strategy.duck.sub.DecoyDuck;
import strategy.duck.sub.MallardDuck;
import strategy.duck.sub.RedHeadDuck;
import strategy.duck.sub.RubberDuck;

public class Main {

	public static void main(String[] args) {

		System.out.println("========오리모형========");
		Duck d1 = new DecoyDuck();
		d1.display();
		d1.performFly();
		d1.performQuack();
		d1.swim();

		System.out.println("========청동오리========");
		Duck d2 = new MallardDuck();
		d2.display();
		d2.performFly();
		d2.performQuack();
		d2.swim();

		System.out.println("========아메리카흰죽지========");
		Duck d3 = new RedHeadDuck();
		d3.display();
		d3.performFly();
		d3.performQuack();
		d3.swim();

		System.out.println("========러버덕========");
		Duck d4 = new RubberDuck();
		d4.display();
		d4.performFly();
		d4.performQuack();
		d4.swim();

	}
}
