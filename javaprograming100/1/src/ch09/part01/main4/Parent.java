package ch09.part01.main4;

public class Parent {

	/** 전역변수 정의 */
	protected String name = "parent";
	public int value = 1;
	private Type type = Type.A;

	/** enum 타입 정의 */
	public enum Type { A, B, C, D };
}
