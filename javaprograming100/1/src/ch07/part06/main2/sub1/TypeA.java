package ch07.part06.main2.sub1;

public class TypeA {

	private String name = "name 속성";

	public TypeA(){}

	public TypeA(String name){
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){ return name; }

	public static void method1(){
		System.out.println("TypeA.method1() - static method1 함수 호출");
	}
}
