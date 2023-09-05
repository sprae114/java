package ch07.part03.main3;

/*
내부 클래스 static, non-static를 설명하는 코드
 */

public class TypeA {

	/** static 전역변수 */
	private static int count1 = 1;

	/** 전역변수 */
	private int count2 = 2;

	/** static 함수 */
	private static void method1() {
	}

	/** none-static 함수 */
	private void method2() {
	}

	/** 내부 클래스 – A클래스만 연관성이 있을 경우 */
	public class TypeB {

		/** none-static 전역변수 */
		private int count3 = 3;

		/** static 전역변수 */
		// private static int count4 = 4;

		/** 함수정의 - 가능 */
		public void method1() {
			System.out.println(count1); /** 전역변수 접근가능 */
			System.out.println(count2); /** static 전역변수 접근가능 */
			method1();
			method2();
		}

		/** static 함수생성 - 불가능 */
		// public static void method2(){
		// System.out.println(count1);
		// System.out.println(count2);
		// }
	}
}
