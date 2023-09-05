package ch07.part06.main6.sub2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ch07.part06.main6.sub1.TypeA;

public class TestMain {
	public static void main(String[] args) throws Exception {

		/** Class 타입 객체생성 → 객체생성 */
		Class clazz = TypeA.class;
		Object obj = clazz.newInstance();

		/** 함수 실행 전 조회 */
		TypeA test = (TypeA) obj;
		System.out.println("변경 전 ::: name [" + test.getName() + "]");
		System.out.println("변경 전 ::: value [" + test.getValue() + "]");

		/** 개별 함수 정보 조회 */
		Method method1 = clazz.getDeclaredMethod("getName");
		Method method2 = clazz.getDeclaredMethod("setName", String.class);
		Method method3 = clazz.getDeclaredMethod("getValue");
		Method method4 = clazz.getDeclaredMethod("setValue", int.class);

		/** 개별 함수 실행 */
		Object result1 = method1.invoke(test);
		Object result2 = method2.invoke(test, "테스트2");
		Object result3 = method3.invoke(test);
		Object result4 = method4.invoke(test, 2);

		/** 함수 실행 후 조회 */
		System.out.println("변경 후 ::: name [" + test.getName() + "]");
		System.out.println("변경 후 ::: value [" + test.getValue() + "]");
	}
}