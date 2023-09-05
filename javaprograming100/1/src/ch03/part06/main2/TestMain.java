package ch03.part06.main2;

import ch03.part06.main2.vo.ProductVo;


/*
오버라이드를 알아보기 위한 코드
 */

public class TestMain {
    public static void main(String[] args){

        ProductVo product1 = new ProductVo();
        product1.setProductNo("a001");
        product1.setProductName("아메리카노");
        product1.setPrice(4000);

        ProductVo product2 = new ProductVo();
        product2.setProductInfo("a002","까페라떼");
        product2.setPrice(4300);

        ProductVo product3 = new ProductVo();
        product3.setProductInfo("a003", "까페모카", 4500);

    }
}
