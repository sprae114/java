package ch11.part01.main5;

public class TestMain {
	private static String name = "TestMain 정적 전역변수 name";
	private static String name2 = "TestMain 정적 전역변수 name2";

	public void method() {
		InnerClass c = new InnerClass();
		c.method2();
	}

	public static class InnerClass {
		private static String name = "InnerClass 정적 전역변수 name";
		private String name2 = "InnerClass 전역변수 name2";

		public void method2() {
			String name = "InnerClass 지역변수 name";

			/** 다음의 변수를 구분하여 콘솔화면에 출력하시오. */
			/** 【문제1】 TestMain 클래스 전역변수 name */
			System.out.println(TestMain.name);
			/** 【문제2】 InnerClass 클래스 전역변수 name */
			System.out.println(TestMain.name2);
			/** 【문제3】 InnerClass 클래스 지역변수 name */
			System.out.println(InnerClass.name);
			/** 【문제4】 TestMain 클래스 전역변수 name2 */
			System.out.println(this.name2);
			/** 【문제5】 InnerClass 클래스 전역변수 name2 */
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new TestMain().method();
	}
}