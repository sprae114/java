package ch09.part02.main8.sub3;

/** 모듈 사용 시 기능목록을 사용자가 정의할 수 있도록 인터페이스 설계 */
public interface IConfirm {
	/** '예'를 선택 시 처리하기위한 추상메소드 정의 */
	public String yesWork();

	/** '아니오'를 선택 시 처리하기위한 추상메소드 정의 */
	public String noWork();
}
