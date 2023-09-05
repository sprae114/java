package ch10.part02.main3.sub2;

public class TestMain {

	/** static method1() 함수 정의 - finally 미사용 */
	public static void method1() {
		boolean isSuccess = true;
		try {
			System.out.println("\t method1 : 로직처리");
			if (isSuccess) {
				System.out.println("\t method1 : return 실행");
				return; /** return 명령이 실행 후 함수 종료 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\t method1 : finally 필수 처리 로직"); /** 실행 안 됨 */
	}

	/** static method2() 함수 정의 - finally 사용 */
	public static void method2() {
		boolean isSuccess = true;
		try {
			System.out.println("\t method2 : 로직처리");
			if (isSuccess) {
				System.out.println("\t method2 : return 실행");
				return; /** return 명령이 실행되어도 finally 구문이 실행됨 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("\t method2 : finally 필수 처리 로직"); /** 실행됨 */
		}
	}

	public static void main(String[] args) {
		System.out.println("method1() 함수실행");
		method1();
		System.out.println("method2() 함수실행");
		method2();
	}
}
