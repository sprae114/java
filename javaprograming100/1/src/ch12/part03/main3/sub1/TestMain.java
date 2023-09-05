package ch12.part03.main3.sub1;

import java.util.HashSet;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 객체생성 및 자료등록 */
		HashSet<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("a");
		System.out.println("set = "+set1);
		System.out.println();

		/** 객체복사【Shallow Copy】 set2 */
		Set<String> set2 = set1;
		System.out.println("• 【set2】자료복사(Shallow Copy) ");
		System.out.println("set2 = "+set2);
		System.out.println();

		/** 객체복사【Deep Copy】 set3 */
		HashSet set3 = (HashSet) set1.clone();
		System.out.println("• 【set3】 자료복사(Deep Copy)");
		System.out.println("set3 = "+set3);
		System.out.println();

		/** 자료추가 시 Shallow Copy와 Deep Copy */
		set1.add("e");
		System.out.println("• 【set1 'e' 자료추가】 ");
		System.out.println("set1 : "+set1); // 변경
		System.out.println("set2 : "+set2); // 영향 있음
		System.out.println("set3 : "+set3); // 영향 없음
	}
}