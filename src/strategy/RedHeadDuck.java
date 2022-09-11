package strategy;

//아메리카흰죽지 (Redhead)
public class RedHeadDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("아메리카흰죽지의 생김새");
	}

	@Override
	public void fly() {
		System.out.println("아메리카흰죽지는 꽥꽥");
	}

	@Override
	public void quack() {
		System.out.println("아메리카흰죽지는 날수있습니다.");
	}
}
