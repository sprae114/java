package ch09.part03.main3;

/** 메인 클래스의 정의 */
public class TestMain {
	public static void main(String[] args) {
		System.out.println("1. ChildClass 객체생성");
		ChildClass childClass1 = new ChildClass();

		System.out.println("2. ChildClass 객체생성");
		ChildClass childClass2 = new ChildClass();

		System.out.println("3. ChildClass 객체생성 후 method1() 함수호출");
		childClass2.method1();

	}
}