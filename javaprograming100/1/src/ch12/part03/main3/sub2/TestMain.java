package ch12.part03.main3.sub2;

import java.util.HashSet;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** 자료구조 객체생성 */
		HashSet<MemberVo> set1 = new HashSet<MemberVo>();

		/** MemberVo 객체생성 */
		MemberVo member1 = new MemberVo("a001","홍길동");
		MemberVo member2 = new MemberVo("a002","이순신");

		/** 자료구조에 자료추가 */
		set1.add(member1);
		set1.add(member2);
		System.out.println("【자료등록】 ");
		System.out.println("\tset1 : "+set1);
		System.out.println();

		/** 자료복사 – Deep Copy */
		HashSet<MemberVo> set2 = (HashSet<MemberVo>) set1.clone();
		System.out.println("【자료복사】 Deep Copy");
		System.out.println("\tset2 : "+set2);
		System.out.println();

		/** 자료 member1 속성변경 */
		member1.memberId = "p001";
		System.out.println("【member1 속성변경】 ");
		System.out.println("\tset1 : "+set1);
		System.out.println("\tset2 : "+set2);
		System.out.println();

		/** 자료의 추가 */
		MemberVo member3 = new MemberVo("a003","강감찬");
		set1.add(member3);
		System.out.println("【member3 객체 자료등록】 ");
		System.out.println("\tset1 : "+set1);
		System.out.println("\tset2 : "+set2);
	}

	/** MemberVo 정적 내부클래스 정의 */
	public static class MemberVo {
		public MemberVo(String memberId, String memberName){
			this.memberId = memberId;
			this.memberName = memberName;
		}
		private String memberId;
		private String memberName;

		public String toString(){
			return "("+memberId +", " + memberName + ")";
		}
	}
}