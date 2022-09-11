package strategy;

public class Main {

	public static void main(String[] args) {

		System.out.println("=========기본 오리=========");
		Duck duck = new Duck();
		//duck.quack();
		duck.swim();
		duck.display();
		//duck.fly();
		//기본오리를 인스턴스화하는건 좋지 않아보임

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
		//rubberDuck.fly(); //날수없음


		System.out.println("=========오리모형=========");
		DecoyDuck decoyDuck = new DecoyDuck();
		//decoyDuck.quack(); 우는거 구현안됨
		decoyDuck.swim();
		decoyDuck.display();





	}
}
