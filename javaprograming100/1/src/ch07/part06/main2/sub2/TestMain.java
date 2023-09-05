package ch07.part06.main2.sub2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {
	/** 예외 처리는 9장에서 다룰 것이다. 일단 넘어가자 */
	public static void main(String[] args) throws Exception {

		/** 1. 동적으로 Class 객체를 가져오기 */
		Class clazz = Class.forName("ch07.part06.main2.sub2.ProductVo");

		/** 2. 생성자 함수 호출하기 – ProductVo(String productName, int price)  */
		Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

		/** 3. Constructor를 이용하여 객체생성 */
		Object obj = constructor.newInstance("테스트2", 2);
		System.out.println("객체정보 ::: " + obj);

		/** 4. prodcutName의 속성 정보 객체 호출 */
		Field field = clazz.getDeclaredField("productName");

		/** 5. productName 속성의 접근 여부 확인 ( private 속성은 false ) */
		boolean isAccessible = field.canAccess(obj);

		/** 6. productName 속성에 직접 접근 가능하도록 설정 */
		field.setAccessible(true); // private 속성은 접근 불가능하기 때문

		/** 7. productName 속성의 값 조회 */
		Object nameFieldValue = field.get(obj);
		System.out.println("productName 속성의 값 ::: " + nameFieldValue);

		/** 8. productName 속성의 값 변경 */
		field.set(obj, "테스트3");
		System.out.println("productName 속성의 값 ::: " + field.get(obj));

		/** 9. name 속성의 접근 여부를 회복 */
		field.setAccessible(isAccessible);

		/** 10. getPrice() 함수 관리 객체 호출 및 함수 실행 */
		Method method = clazz.getDeclaredMethod("getPrice");
		Object returnVal1 = method.invoke(obj);
		System.out.println("getPrice() 함수 호출결과 ::: " + returnVal1);

		/** 11. setPrice() 함수 관리 객체 호출 */
		Method method2 = clazz.getDeclaredMethod("setPrice", int.class);
		Object returnVal2 = method2.invoke(obj, 3);
		System.out.println("setPrice() 함수 호출결과 ::: " + returnVal2);
		System.out.println("객체정보 ::: " + obj);
	}
}