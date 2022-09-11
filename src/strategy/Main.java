package strategy;

public class Main {

	public static void main(String[] args) {

		System.out.println("=========기본 오리=========");
		Duck duck = new Duck();
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();

		System.out.println("=========청동 오리=========");
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.fly();


		System.out.println("=========러버덕=========");
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.quack();
		rubberDuck.swim();
		rubberDuck.display();
		rubberDuck.fly();

	}
}
