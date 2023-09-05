package ch11.part02.main3.result;

public class TestMain {

	/** 전역변수 name을 정의하여 함수와 함수 사이의 자료를 연결한다. */
	private String name;

	public void setName(String name) {
		/** 외부에서 들어오는 파라미터를 전역변수로 전달한다. */
		this.name = name;
	}

	public void print() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		testMain.setName("name");
		testMain.print();
	}
}
