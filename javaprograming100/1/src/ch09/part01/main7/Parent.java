package ch09.part01.main7;

public class Parent {

	/** 정적(static) 초기화블록 */
	static {
		System.out.println("\tParent 클래스 – 정적(static) 초기화블록 구간");
	}

	/** 초기화블록 */
	{
		System.out.println("\tParent 클래스 – 초기화블록 구간");
	}

	/** 생성자함수 1 */
	public Parent() {
		System.out.println("\tParent 클래스 – 생성자함수 구간【1】");
	}

	/** 생성자함수 2 */
	public Parent(int a) {
		System.out.println("\tParent 클래스 – 생성자함수 구간【2】");
	}
}
