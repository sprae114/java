package ch12.part02.main2.sub4;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 1. 자료추출 */
		List<String> list1 = new ArrayList<String>();
		list1.add("a");  list1.add("b"); list1.add("c"); list1.add("d");
		System.out.println("【list1】 "+list1);
		System.out.println();

		List<String> subList1 = list1.subList(0,3);
		System.out.println("1. 자료추출 --");
		System.out.println("\t list1.subList(0,3) = "+subList1);
		System.out.println("【list1】 "+list1);
		System.out.println();

		/** 2. 일괄자료등록 */
		List<String> list2 = new ArrayList<String>();
		list2.add("a");  list2.add("b"); list2.add("e"); list2.add("j"); list2.add("k");
		list1.addAll(list2);
		System.out.println("2. 일괄자료등록 --");
		System.out.println("\t【list2】 "+list2);
		System.out.println("【list1】list1.addAll(list2) = "+list1);
		System.out.println();

		/** 3. 일괄자료포함여부 */
		List<String> list3 = new ArrayList<String>();
		list3.add("a");  list3.add("b"); list3.add("c");
		System.out.println("3. 일괄자료포함여부 -- ");
		System.out.println("\t【list3】 "+list3);
		boolean containsAll1 = list1.containsAll(list3);
		System.out.println("\t list1.containsAll(list3) = "+containsAll1);
		System.out.println("【list1】 "+list1);
		System.out.println();

		/** 4. 일괄자료삭제 */
		List<String> list4 = new ArrayList<String>();
		list4.add("a");  list4.add("b"); list4.add("c");
		list1.removeAll(list4);
		System.out.println("4. 일괄자료삭제 --");
		System.out.println("\t【list4】 "+list4);
		System.out.println("【list1】list1.removeAll(list4) =  "+list1);
		System.out.println();

		/** 5. 공통자료만 남기기 */
		List<String> list5 = new ArrayList<String>();
		list5.add("d");  list5.add("e"); list5.add("c");
		list1.retainAll(list5);
		System.out.println("5. 공통자료 남기기 --");
		System.out.println("\t【list5】 "+list5);
		System.out.println("【list1】list1.retainAll(list5) =  "+list1);
	}
}