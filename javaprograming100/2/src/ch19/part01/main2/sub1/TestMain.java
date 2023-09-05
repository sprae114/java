package ch19.part01.main2.sub1;

public class TestMain {

	public static void main(String[] args) {

		TestMain test = new TestMain();

		/** Math 타입 객체생성 - 파라미터 타입을 지정하는 경우 */
		Math add = (int x, int y) -> x + y;

		/** Math 타입 객체생성 - 파라미터 타입 생략 가능(자동인식)  */
		Math substract = (x, y) -> x - y;

		/** Math 타입 객체생성 - 리턴값이 있는 경우 { } 에 리턴문이 있어야 한다. */
		Math multiply = (int x, int y) -> { return x * y; };

		/** Math 타입 객체생성 - 리턴문만 있는 경우 리턴문 생략 가능 */
		Math divide = (int x, int y) -> x / y;

		System.out.println("20 + 5 = " + test.operate(20, 5, add));
		System.out.println("20 - 5 = " + test.operate(20, 5, substract));
		System.out.println("20 x 5 = " + test.operate(20, 5, multiply));
		System.out.println("20 / 5 = " + test.operate(20, 5, divide));

		/** Echo 타입 객체생성 - 파라미터가 하나인 경우 */
		Echo msg1 = (msg) -> { System.out.println("Hello! " + msg); };

		/** Echo 타입 객체생성 - 파라미터 하나인 경우 괄호() 생략 가능 */
		Echo msg2 = msg -> System.out.println("Hello! " + msg);

		msg1.echo("a");
		msg2.echo("b");

		/** Process 타입 객체생성 - 파라미터가 없는 경우 괄호()를 생략 불가능 */
		Process process = () -> System.out.println("no paramemter!");
		process.echo();

	}

  /** 함수 정의 */
	private int operate(int x, int y, Math math) {
		return math.operation(x, y);
	}

	/** 파라미터가 두 개인 인터페이스 */
	interface Math {
		int operation(int x, int y);
	}

	/** 파라미터가 하나인 인터페이스 */
	interface Echo {
		void echo(String msg);
	}

	/**  파라미터 없는 인터페이스 */
	interface Process {
		void echo();
	}
}