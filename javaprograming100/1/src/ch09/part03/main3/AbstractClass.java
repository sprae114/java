package ch09.part03.main3;

/** 추상클래스의 정의 */
public abstract class AbstractClass {
	private static String var1 = "static 전역변수";
	static {
		System.out.println("\t 추상클래스 - var1 [" + var1 + "]");
	}
	private String var2 = "전역변수";
	{
		System.out.println("\t 추상클래스 - var2 [" + var2 + "]");
	}

	public AbstractClass() {
		System.out.println("\t 추상클래스 - 생성자함수");
		method1();
	}

	public abstract void method1();
}