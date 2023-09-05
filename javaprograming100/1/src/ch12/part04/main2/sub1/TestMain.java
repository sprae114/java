package ch12.part04.main2.sub1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMain {
	public static void main(String[] args) {

		/** 1. 객체생성 */
		Map map1 = new HashMap();
		Map map2 = new TreeMap();
		Map map3 = new LinkedHashMap();

		/** 4. 제네릭스를 이용한 객체생성 */
		Map<String, Integer> map4 = new HashMap<String, Integer>();
		Map<String, Integer> map5 = new TreeMap<String, Integer>();
		Map<String, Integer> map6 = new LinkedHashMap<String, Integer>();
	}
}