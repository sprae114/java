package ch09.part03.main2;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("ClassChild 클래스 객체생성");
		ChildClass c = new ChildClass();
		System.out.println("객체 함수사용");
		c.method2();
	}
}
