package ch11.part02.main3;

/** 프로그램 실행 시 다음 [주석해제] 부분을 주석해제 후 문제를 풀어보시오. */
public class TestMain {
	public void setName(String name) {

	}

	public void print() {
		/** setName()으로 들어오는 name 값을 출력하시오. */
//		System.out.println(name); // 주석해제
	}

	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		testMain.setName("name");
		testMain.print();
	}
}