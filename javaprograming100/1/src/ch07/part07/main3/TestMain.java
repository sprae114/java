package ch07.part07.main3;

import java.lang.reflect.Field;

public class TestMain {
	public static void main(String[] args) {
		try {
			/** ProductVo -> Class -> Field */
			Class clazz = ProductVo.class;
			Field field = clazz.getDeclaredField("productNo");

			/** 어노테이션 객체 호출 */
			Grid anno = field.getAnnotation(Grid.class);

			/** 어노테이션 요소의 값을 호출 */
			String name = anno.name();
			int width = anno.width();
			int order = anno.order();
			System.out.println("name 속성 값 = " + name);
			System.out.println("width 속성 값 = " + width);
			System.out.println("order 속성 값 = " + order);

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}