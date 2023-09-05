package ch21.part01.main2.sub2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
	public static void main(String[] args) {
		String str = "한글연습1234";

		/** 문자열을 이용한 전체 검색 */
		boolean matches = str.matches("^[가-힣]+[0-9]+$");
		System.out.println("전체검색 = " + matches);

		/** 문자열을 이용한 부분 검색 */
		boolean matches2 = str.matches("[가-힣]+");
		System.out.println("부분검색 = " + matches2);

		/** 패턴을 이용하여 문자열을 추출 */
		Matcher matcher = Pattern.compile("[가-힣]+").matcher(str);
		while(matcher.find()){
			/** 해당 패턴에 맞는 문자열 추출하여 반환함 */
			System.out.println("추출문자 = " +matcher.group());
		}
	}
}