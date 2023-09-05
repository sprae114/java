/** 객체생성 */
package ch07.part06.main4.sub2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestMain {
	public static void main(String[] args) {
		Class clazz = TypeA.class;
		/** class 객체를 이용하여 객체생성하기 */
		try {
			Object obj1 = clazz.newInstance();
			TypeA test1 = (TypeA) obj1;
			System.out.println("class 객체를 이용한 객체생성 : " + test1);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		/** Constructor 객체를 이용하여 객체생성하기 */
		try {
			Constructor constructor = clazz.getConstructor(String.class, int.class);
			Object obj2 = constructor.newInstance("테스트", 1);
			TypeA test2 = (TypeA) obj2;
			System.out.println("Constructor 객체를 이용한 객체생성 : " + test2);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}