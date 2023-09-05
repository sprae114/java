package ch11.part02.main4.result;

public class B {

	/** 외부 B 타입 객체 자료전달을 위한 setter 함수 및 전역변수 b 생성 */
	private A a;

	public void setA(A a) {
		this.a = a;
	}

	public void print() {
		/** 【문제3】 연결된 B타입 객체의 name 값에 『자료접근』하여 콘솔화면에 나타낸다. */
		System.out.println(a.getName());
	}
}