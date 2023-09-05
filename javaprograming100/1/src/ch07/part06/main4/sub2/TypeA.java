package ch07.part06.main4.sub2;

public class TypeA {

	/** 전역변수 */
	private String name = "테스트";
	private int value = 1;

	/** 생성자 함수1 */
	public TypeA() {
	}

	/** 생성자 함수2 */
	public TypeA(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "TypeA [name=" + name + ", value=" + value + "]";
	}

}