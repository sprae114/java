package ch12.part02.main4.sub4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<MemberVo> list = new ArrayList<MemberVo>();
		list.add(new MemberVo("p001","아메리카노",4000));
		list.add(new MemberVo("p002","까페모카",4500));
		list.add(new MemberVo("p003","까페라떼",4300));
		System.out.println("\t정렬 전\t"+list);

		/** 이름으로 내림차순정렬 */
		Collections.sort(list, new Comparator<MemberVo>(){
			@Override
			public int compare(MemberVo o1, MemberVo o2) {
				String name1 = o1.productName;
				String name2 = o2.productName;
				if(name1==null && name2==null){ return 0; }
				else if(name1==null && name2!=null){ return -1; }
				else if(name1!=null && name2==null){ return 1; }
				else if(name1!=null && name2!=null){
					return name1.compareTo(name2);
				}
				return 0;
			}
		});
		System.out.println("\t정렬 후\t"+list);
	}

	public static class MemberVo  {

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
			return "MemberVo [" + productId + "," + productName
								+ ", " + price + "]";
		}
	}
}