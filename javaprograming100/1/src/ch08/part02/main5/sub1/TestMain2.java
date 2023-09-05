package ch08.part02.main5.sub1;

import java.util.ArrayList;

public class TestMain2 {
	public static void main(String[] args) {

		/** 제네릭스를 이용한 ArrayList 객체생성 */
		ArrayList<String> list = new ArrayList<String>();

		/** 자료추가 */
		list.add("a");
		list.add("b");
		System.out.println(list);

		/** 향상된 for문을 이용한 개별자료접근 */
		for (String s : list) {
			System.out.println(s);
		}
	}
}
