package ch10.part01.main3;

public class TestMain {
	public void read() {
		try {
			/** try 블록 - 업무로직 처리구간 */

			/** 리플렉션을 이용한 Class 타입 객체생성 */
			Class forName = Class.forName("ch10.part01.main2.ProductVo");

			/** 리플렉션을 이용한 객체생성 */
			ProductVo vo = (ProductVo) forName.newInstance();
			vo.setProductNo("a001");
			vo.setProductName("아메리카노");
			vo.setPrice(4000);
			System.out.println("객체생성 : " + vo);

		} catch (ClassNotFoundException e) {
			/** catch 블록 - 에러발생 시 로직처리구간 */
			e.printStackTrace();
		} catch (InstantiationException e) {
			/** catch 블록 - 에러발생 시 로직처리구간 */
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			/** catch 블록 - 에러발생 시 로직처리구간 */
			e.printStackTrace();
		} finally {
			/** finally 처리구간 */
			System.out.println("마무리 구간 [로직생략가능]");
		}
	}

	/** 메인함수 실행 */
	public static void main(String[] args) {
		/** 객체생성 및 read() 함수호출 */
		TestMain testMain = new TestMain();
		testMain.read();
	}
}