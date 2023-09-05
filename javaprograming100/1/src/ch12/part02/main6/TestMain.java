package ch12.part02.main6;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);

		System.out.println(list);
		/** 인덱스로 삭제 */
		list.remove(1);
		System.out.println(list);

		/** 자료값으로 삭제 */
		list.remove(new Integer(2));
		System.out.println(list);
	}
}
