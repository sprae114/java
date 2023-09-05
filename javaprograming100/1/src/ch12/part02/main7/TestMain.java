package ch12.part02.main7;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 자료구조 객체생성 */
		List<Integer> list = new ArrayList<Integer>();

		/** 자료의 추가 */
		for(int i = 1; i<=10; i++){
			list.add(i*10);
		}

		/** 체크된 인덱스 파악 */
		int[] removeIndexArr = {0, 2, 4, 7, 9};

		/** 해당 인덱스 자료의 삭제 */
		for(int i = 0; i<removeIndexArr.length ; i++){
			int index = removeIndexArr[i];
			list.remove(index);
		}

		/** 결과자료 조회 */
		System.out.println(list);

	}
}