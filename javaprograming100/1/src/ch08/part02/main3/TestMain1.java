package ch08.part02.main3;

public class TestMain1 {

	/** test() 함수 정의 */
	public static int method(int count) {
		/** 변수의 값을 증가 */
		return count++;
	}

	public static void main(String[] args) {

		/** count 변수의 생성 */
		int count = 1;
		System.out.println("count = " + count); // ☞ count = 1

		/** count를 파라미터 전달하여 함수내부에서 값을 증가 */
		method(count);

		/** count의 값은 그대로 유지된다. */
		System.out.println("count = " + count); // ☞ count = 1
	}
}