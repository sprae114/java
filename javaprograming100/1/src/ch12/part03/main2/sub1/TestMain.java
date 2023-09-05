package ch12.part03.main2.sub1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestMain {
	public static void main(String[] args) {

		/** 1. 객체생성 */
		Set set1 = new HashSet();
		Set set2 = new TreeSet();
		Set set3 = new LinkedHashSet();

		/** 2. 제네릭스를 이용한 객체생성 */
		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new TreeSet<String>();
		Set<String> set6 = new LinkedHashSet<String>();

	}
}