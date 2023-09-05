package ch06.part05.main2;

import java.util.Arrays;

/*
기존의 반복적인 코드를 함수 형태로 만들어 추상화하는 코드
 */

public class TestMain {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("자료원본\t: " + Arrays.toString(array));

		int[] array2 = ArrayUtil.add(array, 6);
		System.out.println("자료추가 6\t: " + Arrays.toString(array2));

		int[] array3 = ArrayUtil.add(array2, 21, 7);
		System.out.println("중간삽입 7\t: " + Arrays.toString(array3));

		int[] array4 = ArrayUtil.remove(array3, 1);
		System.out.println("자료삭제 2\t: " + Arrays.toString(array4));

		Arrays.sort(array4);
		System.out.println("자료정렬 \t: " + Arrays.toString(array4));

	}
}
