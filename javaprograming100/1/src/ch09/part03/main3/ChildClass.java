package ch09.part03.main3;

/** 추상클래스를 상속한 자식클래스의 정의 */
public class ChildClass extends AbstractClass {

	private static String var3 = "static 전역변수";

	static {
		System.out.println("\t 구현클래스 - var3 [" + var3 + "]");
	}
	private String var4 = "전역변수";
	{
		System.out.println("\t 구현클래스 - var4 [" + var4 + "]");
	}

	public ChildClass() {
		System.out.println("\t 구현클래스 - 생성자함수");
	}

	public void method1() {
		System.out.println("\t 구현클래스 - method1() - var4 [" + var4 + "]");
	}
}
