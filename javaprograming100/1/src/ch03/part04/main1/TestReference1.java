package ch03.part04.main1;

import ch03.part04.main1.vo.ProductVo;

/*
참조형 코드의 값, 객체주소 값을 비교하기 위한 코드
 */


public class TestReference1 {
	public static void main(String[] args) {

		/** 참조형 변수의 생성 */
		ProductVo product1 = new ProductVo();
		ProductVo product2 = new ProductVo();
		ProductVo product3 = new ProductVo();

		/** Product1의 속성 정보 입력 */
		product1.productNo = "a001";
		product1.productName = "아메리카노";
		product1.price = 3800;

		/** product2 속성 정보 입력 */
		product2.productNo = "a002";
		product2.productName = "카페라떼";
		product2.price = 4300;

		/** product3 속성 정보 입력 */
		product3.productNo = "a003";
		product3.productName = "카페모카";
		product3.price = 4500;

		/** 객체에 담긴 속성의 값 확인 */
		System.out.println("product1의 정보 ----------- ");
		System.out.println("품목번호[" + product1.productNo + "]");
		System.out.println("품목명[" + product1.productName + "]");
		System.out.println("단가[" + product1.price + "]");

		System.out.println("product2의 정보 ----------- ");
		System.out.println("품목번호[" + product2.productNo + "]");
		System.out.println("품목명[" + product2.productName + "]");
		System.out.println("단가[" + product2.price + "]");

		System.out.println("product3의 정보 ----------- ");
		System.out.println("품목번호[" + product3.productNo + "]");
		System.out.println("품목명[" + product3.productName + "]");
		System.out.println("단가[" + product3.price + "]");
		System.out.println();

		/** 객체 비교 A – 같은 객체인지 비교하기 => 객체 메모리 주소 비교하기*/
		boolean compare1 = (product1 == product2); //false
		boolean compare2 = (product1 == product3); //false
		System.out.println("compare1 == product2 : " + compare1);
		System.out.println("compare1 == product3 : " + compare2);

		/** 객체 메모리 주소 정보를 복사하기 */
		ProductVo prod1 = product1;
		ProductVo prod2 = product2;
		ProductVo prod3 = product3;

		/** 객체 비교 B – 같은 객체인지 비교하기 */
		boolean compare3 = (prod1 == product1); //true
		boolean compare4 = (prod2 == product2);	//true
		boolean compare5 = (prod3 == product3);	//true
		System.out.println("prod1 == product1 : " + compare3);
		System.out.println("prod2 == product2 : " + compare4);
		System.out.println("prod3 == product3 : " + compare5);

		/** 타입 비교 */
		boolean typeCompare1 = (product1 instanceof ProductVo);	//true
		boolean typeCompare2 = (product2 instanceof ProductVo);	//true
		boolean typeCompare3 = (product3 instanceof ProductVo);	//true
		System.out.println("product1 instanceof ProductVo : " + typeCompare1);
		System.out.println("product2 instanceof ProductVo : " + typeCompare2);
		System.out.println("product3 instanceof ProductVo : " + typeCompare3);

	}
}