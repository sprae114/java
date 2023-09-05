package ch11.part01.main2;

public class TestMain {

	/** 전역변수 정의 */
	private String name = "TestMain 전역변수 name";  // 【변수1】

	/** 내부클래스 정의 */
	public class InnerClass {

		/** 내부클래스 전역변수 정의 */
		private String name = "InnerClass 전역변수 name"; // 【변수2】

		/** method() 함수 정의 */
		private void method(){

			/** 지역변수 정의 */
			String name = "method() 지역변수 name"; // 【변수3】

			/** AccessTest02 클래스의 전역변수 【변수1】에 접근 */
			System.out.println("【방법1】= " + TestMain.this.name);

			/** Inner 클래스의 전역변수 【변수2】에 접근 */
			System.out.println("【방법2】= " + this.name);

			/** method() 함수 내에서 지역변수 【변수3】에 접근 */
			System.out.println("【방법3】= " + name);
		}
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {
		/** 객체생성 및 함수호출 */
		TestMain testMain = new TestMain();
		testMain.new InnerClass().method();
	}
}