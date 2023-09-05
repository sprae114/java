package ch11.part02.main6;

public class TestMain {
	public static void main(String[] args) {

		A a = new A();

		/** 【문제1】 객체 b에 전역변수 name에 ‘a.name.value’라는 값을 넣는다. */
		a.setName("a.name.value");

		/** 【문제2】 데이터 컨테이너에 객체를 저장한다. */
		DataContainer.a = a; /** 지역변수 a를 『자료전달』 */

		B b = new B();
		b.print();

	}
}
