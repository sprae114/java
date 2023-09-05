package ch09.part01.main6;

public class Child extends Parent {

	/** field2, file3 전역변수 정의 */
	public String field2 = "field2-Child";
	public String field3 = "field3-Child";

	/** method1() 함수 재정의(Override) */
	public void method1(String msg) {
		System.out.println(msg + "\t자식함수 method1()");
	}

	/** method3() 함수 정의 */
	public void method3(){
		System.out.println("method3() 로직시작 -----");
		System.out.println(super.field1);
		System.out.println(super.field2);
		super.method1("method1");
		super.method2("method2");
		System.out.println("method3() 로직종료 -----");
	}

}
