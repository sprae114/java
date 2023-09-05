package ch03.part05.main2;

import ch03.part05.main2.vo.ProductVo;

/*
객체의 메소드를 이용한 속성값 저장및 조회 코드
 */

public class TestMethod {
	public static void main(String[] args) {

		/** 객체의 생성 */
		ProductVo product = new ProductVo();

		/** 함수를 이용하여 속성 값의 저장 */
		product.setProductNo("a001");
		product.setProductName("아메리카노");
		product.setPrice(3800);

		/** 함수를 이용하여 속성 값을 조회 */
		String productNo = product.getProductNo();
		String productName = product.getProductName();
		int price = product.getPrice();

		System.out.println("productNo = " + productNo);
		System.out.println("productName = " + productName);
		System.out.println("price = " + price);

		/** 동적 파라미터의 사용 */
		product.print("아메리카노", "까페라떼", "까페모카");
	}
}