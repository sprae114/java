package ch21.part03.main2.sub1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
	public static void main(String[] args) {

		/** 대상 문자열 */
		String str = "a001가 a002나 a003다 가나다" ;

		/** 【절차1】 정규식을 이용하기 위한 Matcher 객체생성 */
		Matcher matcher = Pattern.compile("([a])([0-9]+)").matcher(str);

		/** 그룹수 */
		print("그룹수", matcher.groupCount());
		System.out.println("--------------");

		/** 【절차2】 검색패턴 일치 문자열을 찾을 때까지 반복  */
		while(matcher.find()){
			/** 【절차3】 반복문 내에서 찾은 문자열 정보 추출 - 전체 문자열 */
			print("패턴검색 전체 ---------> ",matcher.group());
			print("패턴검색 검색1", matcher.group(1));
			print("패턴검색 검색2", matcher.group(2));
		}

		/** 자료초기화 - 처음부터 다시 검색 */
		matcher.reset();
		System.out.println("--------------");

		/** 【절차2】 검색패턴 일치 문자열을 찾을 때까지 반복 */
		while(matcher.find()){

			/** 【절차3】 반복문 내에서 찾은 문자열 정보 추출하기 - 전체 인덱스 */
			String msg = "전체 검색 값 = " + matcher.group();
			msg += " [" + matcher.start();
			msg += " ~ " + matcher.end() + "]";
			System.out.println(msg);
		}

		/** 자료초기화 - 처음부터 다시 검색 */
		matcher.reset();

		System.out.println("--------------");

		/** 【절차2】 검색패턴 일치 문자열을 찾을 때까지 반복 */
		while(matcher.find()){

			/** 【절차3】 반복문 내에서 찾은 문자열 정보 추출하기 - 그룹 인덱스 */
			String msg = "그룹1 검색 값 = " + matcher.group(1);
			msg += "\t(" + matcher.start(1);
			msg += ", " + matcher.end(1) + ")";
			String msg2 = "그룹2 검색 값 = " + matcher.group(2);
			msg2 += "\t(" + matcher.start(2);
			msg2 += ", " + matcher.end(2) + ")";

			System.out.println(msg);
			System.out.println(msg2);
		}
	}

	/** 자료 콘솔화면 출력을 위한 함수 */
	public static void print(String title, Object value){
		System.out.println(title + "[" + value + "]");
	}
}