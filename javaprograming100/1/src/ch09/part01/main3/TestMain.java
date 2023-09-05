package ch09.part01.main3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {

		/** TestMain 클래스 Class 객체생성 */
		Class clz = TestMain.class;

		/** TestMain 클래스의 부모클래스 조회 → Object 클래스 */
		Class superClass = clz.getSuperclass();
		System.out.println("부모클래스 = " +superClass);

		/** 부모클래스(Object)의 필드정보조회 */
		Field[] fields = superClass.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("전역변수 = " + f.getName());
		}

		/** 부모클래스(Object)의 함수정보조회 */
		Method[] methods = superClass.getDeclaredMethods();
		for (Method m : methods) {
			String name = m.getName();
			String parameterTypes = Arrays.toString(m.getParameterTypes());
			System.out.println("함수 = " + name+" : "+parameterTypes);
		}
	}
}