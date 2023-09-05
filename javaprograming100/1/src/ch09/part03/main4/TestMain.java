package ch09.part03.main4;

public class TestMain {
	public static void main(String[] args) {
		ChildClass c = new ChildClass();

		/** 모든 ChildClass 객체는 AbstractClass를 상속받으므로 업캐스팅은 형변환 연산자의 생략이 가능 */
		AbstractClass c1 = c;

		/** 모든 AbstractClass가 ChildClass 타입이라 할 수 없으므로 반드시 형변환 연산자가 필요하다. */
		if (c1 instanceof ChildClass) {
			ChildClass c2 = (ChildClass) c1;
		}
	}
}
