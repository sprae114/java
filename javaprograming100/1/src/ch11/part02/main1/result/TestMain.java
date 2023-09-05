package ch11.part02.main1.result;

public class TestMain {
	public static void main(String[] args) {

		/** 블록1과 블록2에 자료연결을 위해 블록1의 상위 블록에 정의 */
		String name = null;

		/** 블록1 */
		{
			name = "블록1 name";
		}
		/** 블록2 */
		{
			System.out.println(name); // 위에서 생성된 name 변수를 출력
		}
	}
}