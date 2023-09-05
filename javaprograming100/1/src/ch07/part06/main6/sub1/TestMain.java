package ch07.part06.main6.sub1;

import java.lang.reflect.Method;

public class TestMain {
	public static void main(String[] args) {

		/** Class 타입 객체생성 */
		Class clazz = TypeA.class;

		/** 객체생성 */
		TypeA typeA = new TypeA();
		
		/** 함수 정보를 가져옴 */
		System.out.println("---- 전체 함수정보 ----");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName() + "\t" + m.canAccess(typeA) + "\t" + m);
		}

		System.out.println("\r\n---- 전체 public 함수정보 ----");
		Method[] methods2 = clazz.getDeclaredMethods();
		for (Method m : methods2) {
			System.out.println(m.getName() + "\t" + m.canAccess(typeA) + "\t" + m);
		}

		/** 개별 함수 정보 조회 */
		try {

			System.out.println("\r\n---- 개별 함수정보 getName()  ----");
			Method method2 = clazz.getDeclaredMethod("getName");
			System.out.println(method2);

			System.out.println("\r\n---- 개별 함수정보 setName()  ----");
			Method method3 = clazz.getDeclaredMethod("setName", String.class);
			System.out.println(method3);

			/** 개별 함수 중 int 파라미터의 처리 */
			System.out.println("\r\n---- int.class 타입의 처리 - 개별 함수정보 setValue()  ----");
			Method method4 = clazz.getDeclaredMethod("setValue", int.class);
			System.out.println(method4);


			System.out.println("\r\n---- Integer.TYPE 타입의 처리 - 개별 함수정보 setValue()  ----");
			Method method5 = clazz.getDeclaredMethod("setValue", Integer.TYPE);
			System.out.println("함수정보 5 ::: " + method5);
			
			/** 오류 발생함 */
			// Method method6 =
			// clazz.getDeclaredMethod("setValue",Integer.class);
			// System.out.println("함수정보 6 ::: " + method6);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}