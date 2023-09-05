package ch06.part04.main3;

import java.util.Arrays;

/*
arrays를 이용한 함수 설명하는 코드
*/

public class TestMain {
	public static void main(String[] args) {
		/** 배열 객체생성 */
		int[] arr = { 1, 5, 3, 4, 6, 7, 2 };

		/** 배열 오름차순 정렬 - sort() */
		Arrays.sort(arr);

		/** 배열조회 - toString() */
		String toString = Arrays.toString(arr);
		System.out.println(toString);
	}
}