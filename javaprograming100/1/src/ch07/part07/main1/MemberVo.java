package ch07.part07.main1;

public class MemberVo extends DefaultVo {

	/** 정의된 @Grid 어노테이션을 사용 */
	@Grid(name = "회원아이디")
	private String memberId;
	@Grid(name = "회원명")
	private String memberName;

	public MemberVo(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
}