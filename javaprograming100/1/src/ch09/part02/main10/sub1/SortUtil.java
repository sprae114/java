package ch09.part02.main10.sub1;

import java.util.ArrayList;
import java.util.List;

public class SortUtil {

	/** 정수 값 정렬을 위한 함수 정의 */
	public static void sort(List<Integer> list){
		/** 정렬을 위해서는 최소한 값이 2개 이상 존재해야 한다. */
		if(list==null || list.size()<=1 ) return ;
		boolean isChanged = false;
		while(true){
			isChanged = false;
			for(int i = 0; i < list.size()-1; i++){
				/** 순차적으로 list에 임의 자료와 그 다음 인덱스의 자료를 조회 */
				Integer i1 = list.get(i);
				Integer i2 = list.get(i+1);

				/** 두 값을 비교하기 위한 로직구성 - result  */
				/** result : 1(앞의 값이 크다), 0(두 값이 같다), -1(앞의 값이 작다) */
				int result = 0;
				if( i1 > i2 ) result = 1;
				else if(i1==i2) result = 0;
				else if(i1 < i2) result = -1;

				/** 앞의 값이 클 경우만 자리이동 */
				if(result == 1){
					list.set(i, i2);
					list.set(i+1, i1);
					isChanged = true;
				}
			}
			/** 자리바꿈이 일어나지 않을 경우 루프를 벗어난다. */
			if(isChanged==false) break;
		}
	}

	public static void main(String[] args) {
		/** list 객체생성 및 add() 함수를 이용하여 자료등록 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(5);
		/** 전체 list 자료조회 및 콘솔화면 출력 - 정렬 전 */
		System.out.println("처리 전 = " + list);
		/** 자료정렬 함수사용 */
		sort(list);
		/** 전체 list 자료조회 및 콘솔화면 출력 - 정렬 전 */
		System.out.println("처리 후 = " + list)
;
	}
}
