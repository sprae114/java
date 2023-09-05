package ch07.part06.main5.sub1;

import java.lang.reflect.Field;

public class TestMain {
	public static void main(String[] args) {

		/** Class 타입 객체생성 */
		Class clazz = TypeA.class;

		/** 클래스에 정의된 모든 속성 정보를 가져옴 */
		System.out.println("---- 전체속성정보 ----");
		Field[] fields = clazz.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName() + "\t" + f.isAccessible() + "\t" + f);
		}
		System.out.println();

		/** 클래스에 정의된 모든 public 속성 정보를 가져옴 */
		System.out.println("---- public 전체속성정보 ----");
		Field[] fields2 = clazz.getFields();
		for (Field f : fields2) {
			System.out.println(f.getName() + "\t" + f.isAccessible() + "\t" + f);
		}
		System.out.println();

		/** 개별 속성 정보 조회 */
		System.out.println("---- value 속성정보 ----");
		try {
			Field f = clazz.getDeclaredField("value");
			System.out.println(f.getName() + "\t" + f.isAccessible() + "\t" + f);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}