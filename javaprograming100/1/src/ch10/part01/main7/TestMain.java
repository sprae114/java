package ch10.part01.main7;

public class TestMain {

	/** MyException 예외타입을 이용한 예외처리 위임하기 */
	public static void exec(int typeCode) throws MyException {
		if (typeCode < 0) {
			/** 예외발생 */
			throw new MyException("타입코드는 0이상의 값이 입력되어야 합니다.");
		}
		/** exec() 메인로직 처리하기 */
		System.out.println("메인로직 처리 - 오류없음");
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {

		/** 【case1】 정상 – typeCode 에러없음 */
		int typeCode = 1;

		/** 【case2】 예외발생 – typeCode 범위초과 */
		 typeCode = -1;

		/** 예외처리 구간 */
		try {
			TestMain.exec(typeCode);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}