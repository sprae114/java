package ch07.part02.main6;

/*
오버라이딩을 활용한 생성자함수
 */

public class TestMain {
	public static void main(String[] args) {
		/** 객체생성 불가능 : 생성자 함수가 있어 소멸됨 */
		// ProductVo vo1 = new ProductVo();

		/** 생성자 함수 【1】 호출 */
		ProductVo vo2 = new ProductVo("a001");
		vo2.setProductName("아메리카노");
		vo2.setPrice(4000);

		/** 생성자 함수 【2】 호출 */
		ProductVo vo3 = new ProductVo("a002", "까페라떼");
		vo3.setPrice(4300);

		/** 생성자 함수 【3】 호출 */
		ProductVo vo4 = new ProductVo("a003", "까페모카", 4500);

	}
}