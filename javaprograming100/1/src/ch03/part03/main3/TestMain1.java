package ch03.part03.main3;

/*
정수형에서 형변환 코드(형변환 안해도 되는 것은 회색으로 표시됌)
 */

public class TestMain1 {
	public static void main(String[] args) {

		/** 실수 → 정수로 형변환 : 값의 변경 있음 */
		double a = 1.414;
		int b = (int) a;
		System.out.println(b);

		/** 정수 → 실수로 형변환 : 값의 변경 없음 */
		int c = 1;
		double d = (double) c;
		double e = c;

		System.out.println(d);
		System.out.println(e);

		/** char → 정수로 형변환 : 값의 변경 있음 */
		char m = 'A';
		int n = (int) m;
		System.out.println(n);

		/** char → 정수로 형변환 : 값의 변경 있음 */
		int o = 100;
		char p = (char) o;

		long a1 = 300000123;
		System.out.println(a1);
		double b1 = a1;
		System.out.println(b1);
	}
}