package ch03.part02.main1;

import ch03.part02.main1.vo.ProductVo;

/** 패키지가 다른 클래스 import */


/*
 * 참조형 변수를 생성하고 사용하는 방법에 대한 코드
 */

public class TestMain1{
    public static void main(String[] args){
        /** 기본형 변수의 생성 */
        int a = 3;
        System.out.println(a);

        /** 참조형 변수의 객체생성 - product1, product2, product3 */
        ProductVo product1 = new ProductVo();
        ProductVo product2 = new ProductVo();
        ProductVo product3 = new ProductVo();

        /** Product1의 속성 정보 입력 */
        product1.productNo = "a001";
        product1.productName = "아메리카노";
        product1.price = 3800;

        /** product2 정보 입력 */
        product2.productNo = "a002";
        product2.productName = "카페라떼";
        product2.price = 4300;

        /** product3 정보 입력 */
        product3.productNo = "a003";
        product3.productName = "카페모카";
        product3.price = 4500;

        /** 객체에 담긴 속성의 값 확인 */
        System.out.println("product1의 정보 ----------- ");
        System.out.println("품목번호["+product1.productNo+"]");
        System.out.println("품목명[" + product1.productName + "]");
        System.out.println("단가[" + product1.price + "]");

        System.out.println("product2의 정보 ----------- ");
        System.out.println("품목번호["+product2.productNo+"]");
        System.out.println("품목명[" + product2.productName + "]");
        System.out.println("단가[" + product2.price + "]");

        System.out.println("product3의 정보 ----------- ");
        System.out.println("품목번호["+product3.productNo+"]");
        System.out.println("품목명[" + product3.productName + "]");
        System.out.println("단가[" + product3.price + "]");
   }
}