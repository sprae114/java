package ch09.part02.main8.sub4;
public class TestMain {
	public static void main(String[] args) {

		/** B, C 타입 객체생성 */
		B b = new B();
		C c = new C();

		/** 여러 타입을 하나의 타입으로 처리할 수 있다. */
		Module.execute(b);
		Module.execute(c);
  }
}