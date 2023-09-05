package ch07.part07.main4.sub3;

import java.lang.reflect.Field;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) throws Exception {

		Class<ProductVo> clazz = ProductVo.class;

		/** 일반타입 */
		Field field1 = clazz.getDeclaredField("productNo");
		Anno1 anno1 = field1.getAnnotation(Anno1.class);
		String name = anno1.name();
		int value = anno1.value();
		Child child = anno1.child();
		int childValue = child.value();
		DataType dataType = anno1.dataType();

		System.out.println("--- 일반타입 ---");
		System.out.println("name = " + name);
		System.out.println("value = " + value);
		System.out.println("child = " + child);
		System.out.println("\t childValue = " + childValue);
		System.out.println("dataType = " + dataType);

		/** 배열타입 */
		Field field2 = clazz.getDeclaredField("productName");
		Anno2 anno2 = field2.getAnnotation(Anno2.class);
		String[] names = anno2.names();
		int[] values = anno2.values();
		Child[] children = anno2.children();
		DataType[] dataTypes = anno2.dataTypes();

		System.out.println("--- 배열타입 ---");
		System.out.println("names = " + Arrays.toString(names));
		System.out.println("values = " + Arrays.toString(values));
		System.out.println("children = " + Arrays.toString(children));
		for (Child c : children) {
			System.out.println("\t childValue = " + c.value());
		}
		System.out.println("dataTypes = " + Arrays.toString(dataTypes));

	}
}
