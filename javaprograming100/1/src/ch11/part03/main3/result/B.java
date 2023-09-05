package ch11.part03.main3.result;

public class B {
	public void method1(String no){
		if(StringUtil.equalsOr(no, "1", "2")) {
			System.out.println("B 클래스 method1() 함수 로직처리1");
		}else{
			System.out.println("B 클래스 method1() 함수 로직처리2");
		}
	}
}