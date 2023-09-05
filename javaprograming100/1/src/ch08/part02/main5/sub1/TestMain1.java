package ch08.part02.main5.sub1;

import java.util.ArrayList;

public class TestMain1 {
	public static void main(String[] args) {
		
		/** ArrayList 객체생성 */ 
		ArrayList list = new ArrayList();
		
		/** 자료추가 */ 
		list.add("1");
		list.add(2);
		System.out.println(list);
				
		/** for문을 이용한 개별자료접근 */
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			if (obj != null) {
				System.out.println(obj.getClass());
			}
		}
	}
}
