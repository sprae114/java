package ch09.part02.main8.sub5;

import java.util.List;
import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("data1"); /** 자료저장 */
		list.add("data2"); /** 자료저장 */
		list.add("data3"); /** 자료저장 */
		list.add("data4"); /** 자료저장 */

		/** 리스트에 담긴 자료를 향상된 for문을 통하여 조회 */
		for (String s : list) {
			System.out.println("데이터 ::: " + s);
		}
	}
}