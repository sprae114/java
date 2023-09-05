package ch03.part07.main1;

import ch03.part07.main1.vo.ProductVo1;

/*
위치에 따른 접근제한자를 설명하는 코드
 */

public class TestMain {
    public static void main(String[] args){

    	System.out.println("프로그램 실행 시 [주석해제]로 표기된 부분을 주석헤제 하시오.");

        /** ProductVo2 타입의 객체 생성 */
        ProductVo1 prod1 = new ProductVo1();
        prod1.productNo = "a001";
//        prod1.productName = "아메리카노"; // [주석해제]
//        prod1.price = 4000; // [주석해제]
//        prod1.type = 1; // [주석해제]

        /** ProductVo3 타입의 객체 생성 */
        ProductVo2 prod2 = new ProductVo2();
        prod2.productNo = "a001";
        prod2.productName = "아메리카노";
//        prod2.price = 4000; // [주석해제]
        prod2.type = 1;
    }
}

