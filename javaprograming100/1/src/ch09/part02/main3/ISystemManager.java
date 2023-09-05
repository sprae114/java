package ch09.part02.main3;

public interface ISystemManager {

	/** 추상메소드 기능목록 정의 */
	public void start();

	/** 시스템 구동 기능 정의 */
	public void stop();

	/** 시스템 정지 기능 정의 */
	public void status(); /** 시스템상태 확인 기능 정의 */
}
