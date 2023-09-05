package ch07.part04.main2;

/*
enum의 속성값을 설명하는 코드
 */

public class TestMain {
	public static void main(String[] args) {

		/** Gender.MAN 자료선택 */
		Gender gender1 = Gender.MAN;
		int value1 = gender1.getValue();
		String name1 = gender1.getName();
		System.out.println("Gender.MAN value = " + value1);
		System.out.println("Gender.MAN name = " + name1);

		/** Gender.WOMAN 자료선택 */
		Gender gender2 = Gender.WOMAN;
		int value2 = gender2.getValue();
		String name2 = gender2.getName();
		System.out.println("Gender.WOMAN value = " + value2);
		System.out.println("Gender.WOMAN name = " + name2);


	}
}