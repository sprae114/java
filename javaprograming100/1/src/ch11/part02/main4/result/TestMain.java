package ch11.part02.main4.result;

public class TestMain {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		/** 【문제1】 객체 b에 전역변수 name에 ‘value’라는 값 저장 */
		a.setName("a.name.value");

		/** 【문제2】 객체 a에 객체 b를 『자료전달』 */
		b.setA(a);

		b.print();
	}
}