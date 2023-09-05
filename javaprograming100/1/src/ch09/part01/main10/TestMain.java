package ch09.part01.main10;

import javax.swing.JFrame;

public class TestMain {

	public static void main(String[] args) {

		Class clazz = JFrame.class;
		getSuperClass(clazz);

	}

	public static void getSuperClass(Class clazz){
		if(clazz == null) return ;
		System.out.println("클래스명 = " + clazz.getName());

		Class superclass = clazz.getSuperclass();
		if(superclass!=null){
			getSuperClass(superclass);
		}

	}
}
