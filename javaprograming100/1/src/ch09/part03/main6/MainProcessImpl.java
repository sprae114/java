package ch09.part03.main6;

public class MainProcessImpl extends AbstractMainProcess {

	/** setConfig() 추상메소드 재정의 */
	@Override
	public void setConfig() {
		System.out.println("MainProcessImpl 환경설정");
	}

	/** addProcesses() 추상메소드 재정의 */
	@Override
	public IProcess[] addProcesses() {
		IProcess process1 = new Process1();
		IProcess process2 = new Process2();
		IProcess process3 = new Process3();
		return new IProcess[]{process1, process2, process3};
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {

		/** 객체생성 및 main() 함수호출 */
		MainProcessImpl mainProcessImpl = new MainProcessImpl();
		mainProcessImpl.main();
	}
}