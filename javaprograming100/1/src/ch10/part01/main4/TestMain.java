package ch10.part01.main4;

import ch10.part01.main3.ProductVo;

public class TestMain {
	public static void main(String[] args) {
		/** read() 함수를 사용하기 ☞ 사용하는 곳에서 예외처리를 한다. */
		try {
			TestMain testMain = new TestMain();
			testMain.read();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			System.out.println("마무리 구간 [로직생략가능]");
		}
	}

	public void read() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/** 리플렉션을 이용한 Class 타입 객체생성 */
		Class forName = Class.forName("ch10.part01.main1.ProductVo");
		/** 리플렉션을 이용한 객체생성 */
		ProductVo vo = (ProductVo) forName.newInstance();
		vo.setProductNo("a001");
		vo.setProductName("아메리카노");
		vo.setPrice(4000);
		System.out.println("객체생성 : " + vo);
	}
}