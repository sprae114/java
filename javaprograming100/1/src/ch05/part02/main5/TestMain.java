package ch05.part02.main5;

/*
while 반목문 코드
 */

public class TestMain {
	public static void main(String[] args) {

		/** while문을 이용하여 반복문을 실행 */
		int sum = 0;
		int index = 1;
		while (true) {

			/** index의 값을 우선 1씩 증가 */
			index++;

			/** index의 값이 짝수일 경우 다음 반복문을 실행 - continue */
			if (index % 2 == 0){continue;}

			/** 합의 값을 넣는 변수에 인덱스의 값을 더한다. */
			sum += (index++);

			/** 종료조건 - 1000을 넘을 경우 반복문을 종료한다. */
			if (sum > 1000){break;}
		}
		System.out.println("1000을 넘는 첫 번 째 정수는 " + index + "이다.");

		int index2 = 0;
		do {
		    /** 내부로직 처리구간 */
			System.out.println("test");
		} while(index2++ < 10);

	}
}