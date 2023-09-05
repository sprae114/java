package ch09.part02.main8.sub2;

public class TestMain {
	public static void main(String[] args) {

		/** TestImpl 객체생성 및 함수의 사용 */
		System.out.println("ChildImpl 객체생성 및 함수실행 ");
		ChildImpl t1 = new ChildImpl();
		t1.method1();
		t1.method2();
		t1.method3();
		t1.method4();

		/** 업캐스팅 */
		System.out.println("업캐스팅 - IParent 타입 함수실행 ");
		IParent t2 = t1;
		t2.method1();
		t2.method2();
		t2.method3();
		// t2.method4(); // 【오류발생】접근불가하여 오류발생

		/** 다시 다운캐스팅 */
		System.out.println("다운캐스팅 - ChildImpl 타입 함수실행 ");
		ChildImpl t3 = (ChildImpl) t2;
		t3.method1();
		t3.method2();
		t3.method3();
		t3.method4(); // 사용가능
	}
}