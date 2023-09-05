package ch12.part02.main4.sub3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** List에 MemberVo 타입을 정렬 */
		List<MemberVo> list = new ArrayList<MemberVo>();
		list.add(new MemberVo("p001","아메리카노",4000));
		list.add(new MemberVo("p002","까페모카",4500));
		list.add(new MemberVo("p003","까페라떼",4300));

		Collections.sort(list);
		System.out.println(list);
	}

	/** 기본정렬을 정의하기 위해 Comparable 인터페이스 구현 */
	public static class MemberVo implements Comparable<MemberVo> {

		private String productId;
		private String productName;
		private int price;

		public MemberVo(String productId, String productName, int price){
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}

		@Override
		public String toString() {
			return "MemberVo [" + productId + ", " + productName
								+ ", " + price + "]";
		}

		/** Comparable 인터페이스에 정의된 추상메소드 구현 */
		@Override
		public int compareTo(MemberVo o) {

			/** 기본정렬에 대한 정렬기준 정의 */
			if(this.price > o.price){ return 1; }
			else if(this.price == o.price){	return 0; }
			else{ return -1;	}
		}
	}
}