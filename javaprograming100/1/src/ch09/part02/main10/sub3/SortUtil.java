package ch09.part02.main10.sub3;


import java.util.List;

public class SortUtil {

	/** 객체 값 정렬을 위한 함수 정의 */
	public static <T> void sort(List<T> list, Comparator<T> comparator){

		/** 정렬을 위해서는 최소한 값이 2개 이상 존재해야 한다. */
		if(list==null || list.size()<=1 ) return ;
		boolean isChanged = false;
		while(true){
			isChanged = false;
			for(int i = 0; i < list.size()-1; i++){

				/** 순차적으로 list에 임의 자료와 그 다음 인덱스의 자료를 조회 */
				T p1 = list.get(i);
				T p2 = list.get(i+1);

				/** 두 값을 비교하기 위한 로직구성 - result  */
				/** result : 1(앞의 값이 크다), 0(두 값이 같다), -1(앞의 값이 작다) */
				int result = comparator.compare(p1, p2);

				/** 앞의 값이 클 경우만 자리이동 */
				if(result > 0){
					list.set(i, p2);
					list.set(i+1, p1);
					isChanged = true;
				}
			}
			/** 자리바꿈이 일어나지 않을 경우 루프를 벗어난다. */
			if(isChanged==false) break;
		}
	}

	/** 자료정렬 로직처리를 위한 인터페이스 정의 */
	public interface Comparator<T> {
		public int compare(T t1, T t2);
	}
}