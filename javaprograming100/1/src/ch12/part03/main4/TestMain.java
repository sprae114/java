package ch12.part03.main4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 숫자 자료구조 생성 */
		System.out.println("【set1】정렬");
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(5);
		set1.add(3);
		set1.add(4);
		set1.add(1);
		set1.add(2);

		/** 자료정렬 */
		ArrayList arrayList = new ArrayList(set1);
		System.out.println("\t정렬 전\t"+arrayList);
		Collections.sort(arrayList);
		System.out.println("\t정렬 후\t"+arrayList);


		/** 문자열 자료구조 생성 */
		System.out.println("【set2】정렬");
		Set<String> set2 = new HashSet<String>();
		set2.add("나");
		set2.add("가");
		set2.add("a");
		set2.add("k");
		set2.add("D");
		set2.add("P");
		set2.add("1");
		set2.add("3");

		/** 자료정렬 */
		List<String> list2 = new ArrayList<String>(set2);
		System.out.println("\t정렬 전\t"+list2);
		Collections.sort(list2);
		System.out.println("\t정렬 후\t"+list2);
	}
}