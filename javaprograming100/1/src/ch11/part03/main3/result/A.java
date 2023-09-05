package ch11.part03.main3.result;

public class A {
	public void method1(String name){
		if(StringUtil.equalsOr(name, "a", "b", "c")) {
			System.out.println("A 클래스 method1() 함수 로직처리1");
		}else{
			System.out.println("A 클래스 method1() 함수 로직처리2");
		}
	}
}