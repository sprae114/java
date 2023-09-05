package ch07.part02.main1;

public class TypeA {

	/** 정적(static) 전역변수 */
	private static String var1 = "var1";

	/** 전역변수 */
	private String var2 = "var2";

	/** 정적(static) 초기화블록 */
	static {
		System.out.println("\t정적 초기화블록 : var1[" + var1 + "]");
	}

	/** 초기화블록 */
	{
		System.out.println("\t초기화블록 : var1[" + var1 + "], var2[" + var2 + "]");
	}

	/** 생성자함수 1 */
	public TypeA() {
		System.out.println("\t생성자함수1 : var1[" + var1 + "], var2[" + var2 + "]");
	}

	/** 생성자함수 2 */
	public TypeA(String param) {
		System.out.println("\t생성자함수2 : var1[" + var1 + "], var2[" + var2 + "], param [" + param + "]");
	}
}