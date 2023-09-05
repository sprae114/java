package ch07.part02.main1;

/*
정적초기화 블럭 + 초기화블럭 설명
 */

public class TestMain {
	public static void main(String[] args) {

		System.out.println("▶ 객체1 생성");
		TypeA typeA1 = new TypeA();
		System.out.println("▶ 객체2 생성");
		TypeA typeA2 = new TypeA();
		System.out.println("▶ 객체3 생성");
		TypeA typeA3 = new TypeA();
		System.out.println("▶ 객체4 생성");
		TypeA typeA4 = new TypeA("생성자 파라미터1");
		System.out.println("▶ 객체5 생성");
		TypeA typeA5 = new TypeA("생성자 파라미터2");
	}
}
