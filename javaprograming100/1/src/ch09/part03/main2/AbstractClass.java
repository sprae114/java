package ch09.part03.main2;

public abstract class AbstractClass {

	/** 추상메소드 */
	public abstract void method1();

	public void method2() { /** 일반함수 */
		System.out.println("AbstractClass 클래스 method2() 로직");
		method1(); /** 추상메소드 사용가능 */
	}

	public AbstractClass() {
		System.out.println("AbstractClass 생성자함수 ");
	}
}
