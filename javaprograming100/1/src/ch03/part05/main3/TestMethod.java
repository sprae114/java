package ch03.part05.main3;

import ch03.part05.main3.vo.ProductVo;

/*
객체의 메소드를 이용한 속성설정코드
 */

public class TestMethod {
  public static void main(String[] args) {
		/** ProductVo 객체생성 */
    ProductVo v = new ProductVo();

	/** ProductVo 함수사용 */
    v.setProductNo("a001");
    v.setProductName("아메리카노");
    v.setPrice(4000);
    System.out.println("productNo = " + v.getProductNo());
    System.out.println("productName = " + v.getProductName());
    System.out.println("price = " + v.getPrice());
  }
}