package ch12.part06.main1.sub2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		
		/** 【1】 Collections.unmodifiableList() 함수이용 */
		List<String> list = new ArrayList<String>();
		list.add("자료1");
		list.add("자료2");
		list.add("자료3");
		List<String> unmodifiableList = Collections.unmodifiableList(list);

		/** 자료추가 불가능 - 오류발생 */ 
//		unmodifiableList.add("자료4");
		
		/** 자료수정 불가능 - 오류발생 */
//		unmodifiableList.set(0, "자료4");
		System.out.println("unmodifiableList : " + unmodifiableList);

		/** 【2】 Arrays.asList() 함수이용 */		
		String[] array = new String[]{"자료1", "자료2", "자료3"};
		List<String> asList = Arrays.asList(array);

		/** 자료추가 불가능 - 오류발생 */ 
//		asList.add("자료4");
		
		/** 자료수정 가능 */
		asList.set(0, "자료4");
		System.out.println("asList : " + asList);
	}
}