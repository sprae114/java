package ch19.part02.main1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {

		/** 리스트 생성 */
		List<String> list = new ArrayList<String>();
		list.add("아메리카노");
		list.add("까페라떼");
		list.add("까페모카");

		/** 기존의 방법으로 정렬 */
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		System.out.println("-->> collection 정렬");
		for (String obj : list) {
			System.out.println(obj);
		}

		/** 스트림을 이용하여 정렬 */
		System.out.println("-->> stream 정렬");
		list.stream().sorted().forEach(System.out::println);
	}
}