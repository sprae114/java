package ch07.part04.main1;

import ch07.part04.main1.TypeA.GenderType;

/*
클래스로 안에 있는 enum을 사용하는 코드
 */

public class TestMain {
	public static void main(String[] args) {
		TypeA a = new TypeA();

		/** 자료의 입력은 『타입.속성명』 형태로 입력을 한다. */
		a.setGenderType(GenderType.MAN);

		/** 비교는 연산자 『==』로 할 수 있다. */
		if (a.getGenderType() == GenderType.MAN) {
			System.out.println("객체비교 a.getGenderType() [남자]");
		} else if (a.getGenderType() == GenderType.WOMAN) {
			System.out.println("객체비교 a.getGenderType() [여자]");
		} else {
			System.out.println("비교불가");
		}
	}
}
