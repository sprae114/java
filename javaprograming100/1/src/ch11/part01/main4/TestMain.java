package ch11.part01.main4;

public class TestMain {
	private void method() {
		final String name = "method() 함수 지역변수 name"; // 【변수1】

		/** 익명클래스 */
		ITest iTest = new ITest() {
			@Override
			public void method2() {

				/** 【문제1】:【변수1】의 값을 콘솔화면에 나타내시오. */
				System.out.println("【방법1】= " + name);
			}
		};
		iTest.method2();
	}

	public interface ITest {
		public void method2();
	}

	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		testMain.method();
	}
}