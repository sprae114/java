package ch12.part02.main3.sub2;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 자료구조 객체생성 */
		ArrayList<MemberVo> list1 = new ArrayList<MemberVo>();

		/** MemberVo 객체생성 */
		MemberVo member1 = new MemberVo("a001", "홍길동");
		MemberVo member2 = new MemberVo("a002", "이순신");

		/** 자료추가 */
		list1.add(member1);
		list1.add(member2);
		System.out.println("【최초 자료등록】 ");
		System.out.println("\t【list1】 " + list1);

		/** 자료복사 – Deep Copy */
		ArrayList<MemberVo> list2 = (ArrayList<MemberVo>) list1.clone();
		System.out.println("【자료복사 DeepCopy】 ");
		System.out.println("\t【list2】 " + list2);

		/** 자료 member1 속성변경 */
		member1.memberId = "p001";
		System.out.println("【member1 속성변경】 ");
		System.out.println("\t【list1】 " + list1);
		System.out.println("\t【list2】 " + list2);

		/** 자료의 추가 */
		MemberVo member3 = new MemberVo("a003", "강감찬");
		list1.add(member3);
		System.out.println("【member3 객체 자료등록】 ");
		System.out.println("\t【list1】 " + list1);
		System.out.println("\t【list2】 " + list2);
	}

	/** MemberVo 내부클래스 정의 */
	public static class MemberVo {
		public MemberVo(String memberId, String memberName) {
			this.memberId = memberId;
			this.memberName = memberName;
		}

		private String memberId;
		private String memberName;

		public String toString() {
			return "[" + memberId + ", " + memberName + "]";
		}
	}
}