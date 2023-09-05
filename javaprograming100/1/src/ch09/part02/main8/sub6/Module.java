package ch09.part02.main8.sub6;

public class Module {
	public static void execute(A a) {

		System.out.println("execute() 모듈 처리");

		/**
		 * A 타입이면서 B 타입인 객체의 경우 예외적으로 처리를 하고자 할 때 다운캐스팅하여 사용한다. ☞ 구현클래스의 함수를
		 * 사용하고자 할 때 다운캐스팅을 한다.
		 */
		if (a instanceof B) {
			B b = (B) a;
			b.method2();
		}
	}
}
