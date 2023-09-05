package ch11.part01.main1;

public class TestMain {

	/** 전역변수 정의 */
	private String name = "전역변수 name"; // 【변수1】

	/** method1() 함수 정의 */
	public void method1(){

		/** 지역변수 정의 전 - name 변수 콘솔화면 출력 */
		System.out.println("【방법1】=" + name);

		/** 지역변수 name 정의 */
		String name = "지역변수 name"; // 【변수2】

		/** 【문제1】: 【변수1】의 값을 콘솔화면에 나타내시오. */
		System.out.println("【방법2】=" + ch11.part01.main1.TestMain.this.name);
		System.out.println("【방법3】=" + TestMain.this.name);
		System.out.println("【방법4】=" + this.name);

		/** 【문제2】: 【변수2】의 값을 콘솔화면에 나타내시오. */
    System.out.println("【방법5】=" + name);
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {
		/** 객체생성 및 함수사용 */
		TestMain testMain = new TestMain();
		testMain.method1();
	}
}