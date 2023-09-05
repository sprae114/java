package ch11.part02.main2.result;

public class TestMain {
	public static void main(String[] args) {

		/** 『final』 키워드를 이용하여 지역변수와 익명클래스 내부를 연결 */
		final String name = "지역변수 name";

		/** ITest 익명클래스 객체생성 */
		ITest test = new ITest() {
			public void method() {

				/** 지역변수와 익명클래스 내부 함수의 자료 연결 */
				System.out.println(name);

			}
		};
		test.method();
	}

	public interface ITest {
		public void method();
	}
}