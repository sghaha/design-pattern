package strategy;

//Mallard : 청동오리
public class MallardDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("청동오리의 생김새");
	}

	@Override
	public void quack() {
		System.out.println("청동오리는 꽥꽥");
	}

	@Override
	public void fly() {
		System.out.println("청동오리는 날수있습니다.");
	}
}
