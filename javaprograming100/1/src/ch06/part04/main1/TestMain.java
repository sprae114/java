package ch06.part04.main1;

import java.util.Arrays;

/*
배열과 arrays를 이용한 함수 설명하는 코드
 */

public class TestMain {
	public static void main(String[] args) {

		/** 배열객체 생성하기 */
		int[] arr1 = new int[] { 1, 3, 5, 2, 4 };

		/** 배열복사하기 */
		int[] arr2 = new int[5];
		System.arraycopy(arr1, 1, arr2, 0, 2);

		/** for문을 이용하여 복사된 배열 조회 */
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("배열 [" + i + "] = " + arr2[i]);
		}

		/** Arrays.toString()을 이용하여 배열조회 하기 */
		String toString = Arrays.toString(arr1);
		System.out.println(toString);

		/** Arrays.sort()을 이용하여 배열정렬 하기 */
		Arrays.sort(arr1); /** 크기 순으로 정렬 */

		/** Arrays.toString()을 이용하여 정렬된 배열조회 하기 */
		System.out.println(Arrays.toString(arr1));
	}
}