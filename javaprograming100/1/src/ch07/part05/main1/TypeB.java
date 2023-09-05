package ch07.part05.main1;

public class TypeB {

	/** 제네릭 타입을 이용한 함수 정의 1 */
	public <T> T method1(T t) {
		return t;
	}

	/** 제네릭 타입을 이용한 함수 정의 2 */
	public static <T> T method2(T t) {
		return t;
	}

	/** 제네릭 타입을 이용한 함수 정의 3 */
	public <T> T method3(TypeA<T> a) {
		return a.getT();
	}

	/** 제네릭 타입을 이용한 함수 정의 4 */
	public static <T> T method4(TypeA<T> a) {
		return a.getT();
	}
}