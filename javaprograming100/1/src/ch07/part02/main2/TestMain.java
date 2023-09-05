package ch07.part02.main2;

import java.util.Arrays;

/*
정적 변수 사용하는 코드
 */

public class TestMain {
	public static void main(String[] args) {
		/**
		 * 향후에 화면 구성 시 아래와 같이 표로 나타내기 위해서는 String[] 정보가 필요하다.
		 */
		String[] headerNames = ProductVo.HEADER_NAEMS;
		System.out.println(Arrays.toString(headerNames));
	}
}