package strategy;

//러버덕
public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("러버덕의 생김새");
	}

	@Override
	public void quack() {
		System.out.println("러버덕은 삑삑하고 웁니다.");
	}

	@Override
	public void fly() {
		//아무것도 하지 않음
	}
}
