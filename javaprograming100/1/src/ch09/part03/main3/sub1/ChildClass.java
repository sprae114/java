package ch09.part03.main3.sub1;

public class ChildClass extends AbstractClass {
	private String name = "자식클래스변수";

	@Override
	public void method1() {
		int length = name.length(); /** length() : 글자의 길이를 나타내는 함수 */
		System.out.println("글자의 길이 = " + length);
	}
}
