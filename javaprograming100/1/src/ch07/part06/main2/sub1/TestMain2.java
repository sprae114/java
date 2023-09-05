package ch07.part06.main2.sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestMain2 {

	/** 예외처리를 위해 아래와 같이 『throws Exception』 처리를 하자. */
	public static void main(String[] args) throws Exception {

		// TypeA a1 = new TypeA();
		Class forName = Class.forName("ch07.part06.main2.sub1.TypeA");
		Object a1 = forName.newInstance();

		// String name1 = a1.getName();
		Method method1 = forName.getDeclaredMethod("getName");
		Object name1 = method1.invoke(a1);
		System.out.println("a1 name = " + name1);

		// a1.setName("name2");
		Method method2 = forName.getDeclaredMethod("setName", String.class);
		method2.invoke(a1, "name2");

		//String name2 = a1.getName();
		Object name2 = method1.invoke(a1);
		System.out.println("a1 name = " + name2);

		// TypeA a2 = new TypeA("name3");
		Constructor constructor = forName.getDeclaredConstructor(String.class);
		Object a2 = constructor.newInstance("name3");

		//String name3 = a2.getName();
		Object name3 = method1.invoke(a2);
		System.out.println("a2 name = " + name3);

		//TypeA.method1();
		Method method3 = forName.getDeclaredMethod("method1");
		method3.invoke(null);
	}
}