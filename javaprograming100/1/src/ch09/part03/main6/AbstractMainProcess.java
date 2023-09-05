package ch09.part03.main6;

public abstract class AbstractMainProcess {

	/** 사용자의 환경에 맞게 설정을 하기 위한 추상메소드 정의 */
	public abstract void setConfig();

	/** 업무처리 등록을 위한 추상메소드 정의 */
	public abstract IProcess[] addProcesses();

	/** 메인업무처리를 위한 메인함수 정의 */
	public final void main() {
		/** 절차1 : 환경 설정 */
		setConfig();

		/** 절차2 : 사용자 등록 절차처리 */
		IProcess[] processes = addProcesses();
		if (processes != null) {
			for (IProcess p : processes) {
				/** 절차3 : 절차처리 */
				p.execute();
			}
		}
	}

	/** 절차처리를 위한 인터페이스 정의 */
	public interface IProcess {
		/** 절차업무 처리를 위한 execute() 함수정의 */
		public void execute();
	}
}