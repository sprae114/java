package ch11.part02.main6;

public class B {
	public void print() {

		/** DataContainer로부터 객체 b의 『자료접근』을 한다. */
		A a = DataContainer.a;
		String name = "";
		if (a != null) {
			name = a.getName();
		}
		System.out.println(name);

	}
}
