package ch11.part02.main5;

public class TestMain {

	public static void main(String[] args) {

		/** A 타입 count 정적 전역변수 1증가 */
		A.count++;

		/** A 타입 a01 객체생성 및 count 정적 전역변수 1증가 */
		A a01 = new A();
		a01.count++;

		/** A 타입 a02 객체생성 및 count 정적 전역변수 1증가 */
		A a02 = new A();
		a02.count++;

		/** A 타입 a03 객체생성 및 count 정적 전역변수 1증가 */
		A a03 = new A();
		a03.count++;

		/** 【문제】 다음의 결과 값을 코드작성 전에 풀어보시오. */
		System.out.println(a01.count);
	}
}