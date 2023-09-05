package ch12.part02.main2.sub2;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 객체생성 */
		List<String> list = new ArrayList<>();
		System.out.println("【객체생성1】 " + list);

		/** 자료등록 [a, b, c] */
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("【자료등록2】 " + list);

		/** 중간 자료등록 [d, a, b, c] */
		list.add(0, "d");
		System.out.println("【중간 자료등록3】 " + list);

		/** 자료조회【1】 */
		System.out.println("【자료조회4】");
		for (int i = 0; i < list.size(); i++) {
			String data = list.get(i);
			System.out.println("\t인덱스[" + i + "] = " + data);
		}

		/** 자료조회【2】: 향상된 for문 */
		System.out.println("【자료조회5】");
		for (String data : list) {
			System.out.println("\t자료 = " + data);
		}
	}
}