package strategy;

//러버덕
public class RubberDuck extends Duck implements Quackable{

	@Override
	public void display() {
		System.out.println("러버덕의 생김새");
	}

	@Override
	public void quack() {
		System.out.println("러버덕은 삑삑하고 웁니다.");
	}
}
