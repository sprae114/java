package ch03.part08.main1;

import ch03.part08.main1.vo.ProductVo;

/*
static 변수와 함수를 설명하는 코드
 */

public class TestMain {
    public static void main(String[] args){
       /** 접근 가능한 static 변수의 호출 => 처음에 객체를 생성하지 않아도 사용가능함*/
       String productNoKor = ProductVo.productNoKor;
       String productNameKor = ProductVo.productNameKor;
       String priceKor = ProductVo.priceKor;
       print("productNoKor",productNoKor);
       print("productNameKor",productNameKor);
       print("priceKor", priceKor);

       /** 접근 가능한 static 변수를 객체1에서 호출 */
       ProductVo product1 = new ProductVo();
       String productNoKor1 = product1.productNoKor;
       String productNameKor1 = product1.productNameKor;
       String priceKor1 = product1.priceKor;
       print("productNoKor1",productNoKor1);
       print("productNameKor1",productNameKor1);
       print("priceKor1", priceKor1);


       /** 접근 가능한 static 변수를 객체2에서 호출 */
       ProductVo product2 = new ProductVo();
       String productNoKor2 = product2.productNoKor;
       String productNameKor2 = product2.productNameKor;
       String priceKor2 = product2.priceKor;
       print("productNoKor2",productNoKor2);
       print("productNameKor2",productNameKor2);
       print("priceKor2",priceKor2);


       /** static 변수를 변경 */
       product1.productNameKor = "제품명";
       print("product1.productNameKor",product1.productNameKor);
       print("product2.productNameKor",product2.productNameKor);

    }

    private static void print(String title, String param){
    	System.out.println(title+"\t"+param);
    }
}