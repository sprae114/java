package ch12.part06.main1.sub1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 【1】 List 불변 자료구조 객체생성 */
		List<String> list = new ArrayList<String>();
		list.add("자료1");
		list.add("자료2");
		list.add("자료3");
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		
		/** list는 자료변경이 가능하다. */
		list.add("자료4");
				
		/** 다음을 주석해제 후 실행을 할 경우 에러가 발생된다. */
//		unmodifiableList.add("자료5");
		
		/** ununmodifiableList 자료조회 */
		System.out.println("unmoifiableList : " + unmodifiableList);
		
		/** 【2】 Set 불변 자료구조 객체생성 */
		Set<String> set = new HashSet<String>();
		set.add("자료1");
		set.add("자료2");
		set.add("자료3");
		Set<String> unmodifiableSet = Collections.unmodifiableSet(set);

		/** set은 자료변경이 가능하다. */
		set.add("자료4");
				
		/** 다음을 주석해제 후 실행을 할 경우 에러가 발생된다. */
//		unmodifiableSet.add("자료5");
		
		/** unmodifiableSet 자료조회 */
		System.out.println("unmodifiableSet : " + unmodifiableSet);
		
		/** 【3】 Collection 불변 자료구조 객체생성 */
		List<String> list2 = new ArrayList<String>();
		list2.add("자료1");
		list2.add("자료2");
		list2.add("자료3");
		Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(list2);

		/** set은 자료변경이 가능하다. */
		list2.add("자료4");
				
		/** 다음을 주석해제 후 실행을 할 경우 에러가 발생된다. */
//		unmodifiableCollection.add("자료5");
		
		/** unmodifiableCollection 자료조회 */
		System.out.println("unmodifiableCollection : " + unmodifiableCollection);
		
		/** 【4】 Map 불변 자료구조 객체생성 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);

		/** set은 자료변경이 가능하다. */
		map.put("key4", "value4");
				
		/** 다음을 주석해제 후 실행을 할 경우 에러가 발생된다. */
//		unmodifiableMap.put("key5", "value5");
		
		/** unmodifiableCollection 자료조회 */
		System.out.println("unmodifiableMap : " + unmodifiableMap);
	}
}