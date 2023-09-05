package ch08.part02.main3;

public class TestMain2 {

	/** static method() 함수 정의 */
	public static void method(TypeA a) {

		/** 파라미터 객체의 count 속성 값 변경 */
		a.setCount(a.getCount() + 1);
	}

	public static void main(String[] args) {

		/** TypeA 객체생성 */
		TypeA a = new TypeA();
		a.setCount(1);
		System.out.println(a.getCount()); // ☞ count = 1

		/** 함수사용 - TypeA 객체를 파라미터로 사용 - 함수에서 객체 속성변경 */
		method(a);

		/** 변수속성 변경여부 확인 */
		System.out.println(a.getCount()); // ☞ count = 2
	}
}