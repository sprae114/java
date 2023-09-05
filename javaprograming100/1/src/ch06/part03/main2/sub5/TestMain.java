package ch06.part03.main2.sub5;

/*
객체를 이용한 배열 생성및 조회 방법 코드
 */

public class TestMain {
	public static void main(String[] args) {
		
		/** MemberVo member1, member2, member3 객체생성 */
		MemberVo member1 = new MemberVo();
		member1.setMemberNo("a001");
		member1.setMemberName("김철수");
		member1.setCellPhone("010-1111-1111");
		MemberVo member2 = new MemberVo();
		member2.setMemberNo("a002");
		member2.setMemberName("이영희");
		member2.setCellPhone("010-2222-2222");
		MemberVo member3 = new MemberVo();
		member3.setMemberNo("a003");
		member3.setMemberName("박남수");
		member3.setCellPhone("010-3333-3333");
		
		/** MemberVo 배열 객체생성 */
		MemberVo[] members = { member1, member2, member3 };

		/** 배열객체 자료조회 */
		for(MemberVo m : members){
			String info = m.getMemberNo();
			info += "\t" + m.getMemberName();
			info += "\t" + m.getCellPhone();
			System.out.println(info);
		}



	}
}
