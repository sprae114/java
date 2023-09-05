package ch03.part08.main3;

/*
static 함수 내부 로직에서는 non-static 변수 및 함수는 객체생성 이후에 사용해야 한다는 코드
 */

public class TestMain {

	/** none-static 전역변수 */
	private String name1 = "name1";

	/** static 전역변수의 정의 */
	private static String name2 = "name2";

	/** static 함수의 정의 */
	public static void method1() {

	   	System.out.println("프로그램 실행 시 method1() 함수 내 [주석해제]로 표기된 부분을 주석헤제 하시오.");

//		System.out.println(name1); //  [주석해제] /** ※ 오류발생 - 사용이 불가능하다. */
		System.out.println(name2);
	}

	/** none-static 함수의 정의 */
	public void method2() {
		System.out.println(name1);
		System.out.println(name2);
	}

	/** 메인함수 - static 함수 */
	public static void main(String[] args) {

	   	System.out.println("프로그램 실행 시 main() 함수 내 [주석해제]로 표기된 부분을 주석헤제 하시오.");

		/** static 함수는 직접 호출이 가능하다. */
		TestMain.method1();
		method1(); /** 같은 클래스에서 클래스명은 생략이 가능 */

		/** static이 아닌 함수는 객체생성 이후 사용이 가능하다. */
//		method2(); //  [주석해제] /** ※ 오류발생 - 사용이 불가능하다. */

		/** static이 아닌 함수는 객체생성 이후 사용이 가능하다. */
		TestMain testMain = new TestMain();
		testMain.method2();
	}
}