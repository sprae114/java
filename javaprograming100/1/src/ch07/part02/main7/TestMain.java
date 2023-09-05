package ch07.part02.main7;

/*
static을 활용해서 싱글톤 만드는 코드
 */

public class TestMain {
	public static void main(String[] args) {
		SingletonType type1 = SingletonType.getInstance();
		SingletonType type2 = SingletonType.getInstance();
		if (type1 == type2) {
			System.out.println("a1객체와 a2객체는 메모리주소가 같다. ");
		} else {
			System.out.println("a1객체와 a2객체는 메모리주소가 다르다. ");
		}
	}
}