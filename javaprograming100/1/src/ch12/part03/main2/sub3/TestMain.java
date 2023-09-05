package ch12.part03.main2.sub3;

import java.util.HashSet;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 1. 객체생성 */
		System.out.println("【객체생성】");
		Set<String> set1 = new HashSet<String>();
		System.out.println("\t set1 : " + set1);

		/** 2. 자료등록 */
		System.out.println("【자료등록】add() : a, b, c, d ");
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		System.out.println("\t set1 : " + set1);
		System.out.println();

		/** 3. 자료수정 : 존재하지 않음 */

		/** 4. 자료삭제 */
		System.out.println("【자료삭제】 remove() : a, b");
		set1.remove("a");
		set1.remove("b");
		System.out.println("\t set1 : " + set1);
		System.out.println();

		/** 5. 자료포함여부 */
		System.out.println("【자료포함여부】contains() : b, c");
		boolean contains1 = set1.contains("b");
		boolean contains2 = set1.contains("c");
		System.out.println("\t set1 'b' 포함여부 : " + contains1);
		System.out.println("\t set1 'c' 포함여부 : " + contains2);
	}
}