package ch11.part01.main3;

public class TestMain {

	/** TestMain 전역변수 name 정의 */
	private String name = "TestMain  전역변수 name"; // 【변수1】

	/** method() 함수 정의 */
	private void method() {

		/** 지역변수 name 정의 */
		String name = "method() 함수 지역변수 name"; // 【변수2】

		/** 익명클래스 */
		ITest iTest = new ITest() {
			/** 익명클래스 전역변수 name 정의 */
			private String name = "익명클래스 전역변수 name"; // 【변수3】

			/** method2() 함수 재정의 */
			@Override
			public void method2() {

				/** 지역변수 name 정의 */
				String name = "method2() 함수 지역변수 name"; // 【변수4】

				/** TestMain 클래스의 전역변수 【변수1】에 접근 */
				System.out.println("【방법1】= " + TestMain.this.name);

				/** method() 지역변수 【변수2】에 접근 */
				// → 익명클래스내의 지역변수와 중복되어 접근 불가

				/** 익명클래스 전역변수 【변수3】에 접근 */
				System.out.println("【방법3】= " + this.name);

				/** method2() 함수 내에서 지역변수 【변수4】에 접근 */
				System.out.println("【방법4】= " + name);

			}
		};
		iTest.method2();
	}

	/** 인터페이스 정의 */
	public interface ITest {
		public void method2();
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		testMain.method();
	}
}