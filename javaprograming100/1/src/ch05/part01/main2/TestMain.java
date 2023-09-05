package ch05.part01.main2;

/*
if, eles if를 설명하는 코드
 */

public class TestMain {
	public static void main(String[] args) {

		/** if문을 이용한 7으로 나눌 때 나머지값 분류 */
		int a = 10;
		if (a % 7 == 1) {
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 1인 수");
		} else if (a % 7 == 2 || a % 7 == 3) {
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 2 또는 3인 수");
		} else if (a % 7 == 4 || a % 7 == 5) {
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 4 또는 5인 수");
		} else if (a % 7 == 6 ) {
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 6인 수");
		} else {
			System.out.println("a[" + a + "]는 7로 나누어지는 수");
		}

	}
}