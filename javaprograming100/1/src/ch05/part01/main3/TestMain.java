package ch05.part01.main3;

/*
switch를 사용해서 분류하는 경우
 */

public class TestMain {
	public static void main(String[] args) {

		/** if문을 이용한 7으로 나눌 때 나머지값 분류 */
		int a = 10;
		switch (a % 7) {
		case 1:
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 1인 수");
			break;
		case 2:
		case 3:
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 2 또는 3인 수");
			break;
		case 4:
		case 5:
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 4 또는 5인 수");
			break;
		case 6:
			System.out.println("a[" + a + "]는 7로 나눌 때 나머지가 6인 수");
			break;
		default:
			System.out.println("a[" + a + "]는 7로 나누어지는 수");
		}
	}
}
