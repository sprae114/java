package ch07.part05.main3;

/*
와일드카드타입(?)을 이용한 제네릭함수 설명
와일드카드 타입이란 제네릭 타입을 타입 파라미터로 하는 경우에 사용된다
 */

public class TestMain2 {
	public static void main(String[] args) {

		/** 타입 : TypeA<String> - <T extends TypeA<String> */
		TypeB<TypeA<String>> typeB = new TypeB<TypeA<String>>();

		/** 타입 : TypeA<String> - <T extends TypeA<Object>> */
		// TypeC<TypeA<Object>> typeC = new TypeC<TypeA<String>>();

		/** 타입 : TypeA<String> - <T extends TypeA<?>> */
		TypeD<TypeA<String>> typeD = new TypeD<TypeA<String>>();

	}
}
