package ch12.part05.main1.sub5;

import java.util.Properties;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 시스템 정보 조회 */
		Properties properties = System.getProperties();
		Set<Object> keySet = properties.keySet();
		for(Object key : keySet){
			System.out.println(key + " : " + properties.get(key));
		}
	}
}