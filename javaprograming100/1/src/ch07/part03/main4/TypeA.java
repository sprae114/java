package ch07.part03.main4;

/*
정적 내부클래스를 설명하는 코드
 */

public class TypeA {

	/** static 전역변수 */
	private static int count1 = 1;

	/** 전역변수 */
	private int count2 = 2;

	/** static 함수 */
	private static void method1() { 	}

	/** 함수 */
	private void method2() { }

	/** 중첩클래스 정의 */
	public static class TypeB {

		/** 전역변수 정의 → 가능 */
		private int count3 = 3;

		/** static 전역변수 → 가능 */
		// private static int count4 = 4;

		/** 함수정의 → 가능 */
		public void method3() {
			System.out.println(count1);	/** Outer 클래스 static 전역변수 접근가능 */
			//System.out.println(count2);	/** Outer 클래스 전역변수 접근불가능 */
			method1(); 								/** Outer 클래스 static 함수 접근가능 */
			//method2(); 							/** Outer 클래스 함수 접근불가능 */
		}

		/** static 함수생성 → 가능 */
		public static void method4(){
			System.out.println(count1);	/** Outer 클래스 static 전역변수 접근가능 */
			//System.out.println(count2);	/** Outer 클래스 전역변수 접근불가능 */
			method1(); 								/** Outer 클래스 static 함수 접근가능 */
			//method2(); 							/** Outer 클래스 함수 접근불가능 */
		}
	}
}