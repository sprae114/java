package ch12.part04.main2.sub2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 객체생성 */
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		System.out.println("• 자료생성");
		System.out.println("map1 = "+map1);
		System.out.println();

		/** 자료등록 [a, b, c] */
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("a", 4); /** 자료의 수정 ☞ key 'a'에 값을 덮어쓴다. */
		System.out.println("• 자료등록");
		System.out.println("map1 = "+map1);
		System.out.println();

		/** 자료조회 */
		System.out.println("• 자료조회");
		/** keySet()을 이용한 key 자료조회 */
		Set<String> keySet = map1.keySet();
		for(String key : keySet){
			/** get() 함수를 이용한 자료조회 */
			int data = map1.get(key);
			System.out.println("\tkey["+ key + "], value["+data+"]");
		}
	}
}