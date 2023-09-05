package ch07.part05.main1;

/** 제네릭 타입이 T인 클래스 정의 */
public class TypeA<T> {

	/** 제네릭 타입을 타입으로 하는 속성정의 */
	private T t;

	/** 제네릭 타입을 이용한 생성자함수 */
	public TypeA(T t) {
		this.t = t;
	}

	/** 반환타입이 제네릭 타입(T 타입)인 getter 함수 정의 */
	public T getT() {
		return t;
	};
}