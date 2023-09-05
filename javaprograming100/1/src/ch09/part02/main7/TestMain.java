package ch09.part02.main7;

import ch09.part02.main7.IAction.D;

public class TestMain {
	public static void main(String[] args) {

		/** 익명클래스 객체생성 */ 
		IAction action = new IAction() {
			@Override
			public void method1() {
				System.out.println("method1() 함수 재정의");
			}
		};
		
		/** 1. 추상메소드 정의 */
		System.out.println("1. 추상메소드 정의");
		action.method1();
		
		/** 2. final static 변수 */
		System.out.println("2. final static 변수");
		String rootTempDir = IAction.ROOT_TEMP_DIR;
		String systemName = IAction.SYSTEM_NAME;
		System.out.println("\t rootTempDir = " + rootTempDir);
		System.out.println("\t systemName = " + systemName);
		
		/** 3. enum 정의 */
		System.out.println("3. enum 정의");
		D typeA = IAction.D.TYPE_A;
		System.out.println("\t typeA = " + typeA);
		
		
		/** 4. default 메소드 */
		System.out.println("4. default 메소드");
		action.method2();
		
		/** 5. static 메소드 */
		System.out.println("static 메소드");
		IAction.method3();
				
		/** 6. private 메소드 호출 */
		System.out.println("6. private 메소드 호출");
		action.method6();
		System.out.println("7. private static 메소드 호출");
		IAction.method7();
	}
}
