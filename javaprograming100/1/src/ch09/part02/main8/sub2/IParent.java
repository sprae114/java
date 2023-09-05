package ch09.part02.main8.sub2;

public interface IParent {

	public void method1();

	public default void method2() {
		System.out.println("\tIParent method2() default 함수호출");
	}

	public default void method3() {
		System.out.println("\tIParent method3() default 함수호출");
	}
}