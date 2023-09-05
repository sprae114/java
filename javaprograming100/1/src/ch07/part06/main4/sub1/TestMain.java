/** 생성자 함수 조회 */
package ch07.part06.main4.sub1;

import java.lang.reflect.Constructor;

public class TestMain {
	public static void main(String[] args)  {

		/** Class 타입 객체생성 */
		Class clazz = TypeA.class;

		/** 명시된 생성자함수 정보를 가져옴 */
		Constructor[] constructors = clazz.getDeclaredConstructors();

		/** 명시된 전체 생성자함수 정보 조회 */
		for (Constructor c : constructors) {
			System.out.println("생성자함수 목록 - " + c);
		}

		try {
			/** 기본생성자 함수 정보 조회 */
			Constructor constructor2 = clazz.getDeclaredConstructor();
			System.out.println(constructor2);

			/** 파라미터 타입이 String, int인 생성자 함수 조회 */
			Constructor constructor3 = clazz.getDeclaredConstructor(String.class, Integer.TYPE);
			System.out.println(constructor3);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}