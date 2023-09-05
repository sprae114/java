package ch09.part01.main5;

public class TestMain {
	public static void main(String[] args) {

		/** Parent 객체생성 */
		Parent p = new Parent();
		p.method1("1");
		p.method2("2");
		p.method3("3");

		/** Child 객체생성 */
		Child c = new Child();
		c.method1("4");
		c.method2("5");
		c.method3("6");
		c.method4("7");
	}
}