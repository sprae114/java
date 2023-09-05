package ch07.part01.main1;

import java.util.Arrays;

/*
객체의 정적 초기화와 초기화 블럭에 대한 코드 설명 + ArayysUtil 이용
(정적 초기화는 객체가 최초실행일때 한번, 초기화 블럭은 객체가 생성될때마다 실행)
 */

public class TestMain {
	public static void main(String[] args) {

		/** ArayUtil 클래스를 이용하여 배열을 동적으로 CRUD */
		String[] arr11 = { "a", "b", "c" };
		System.out.println("arr11 기존 - " + Arrays.toString(arr11));
		String[] arr12 = ArrayUtil.add(arr11, "ddd");
		System.out.println("arr12 추가 - " + Arrays.toString(arr12));
		String[] arr13 = ArrayUtil.remove(arr12, 0);
		System.out.println("arr13 삭제 - " + Arrays.toString(arr13));

		/** 동일객체 여부파악 */
		boolean isSame1 = (arr11 == arr12);
		boolean isSame2 = (arr12 == arr13);
		String msg = "동일객체 여부 isSame1["+isSame1+"], isSame2["+isSame2+"]";
		System.out.println(msg + "\r\n");

		/** ArayUtil 클래스를 이용하여 배열을 동적으로 CRUD */
		int[] arr2 = { 1, 2, 3 };
		System.out.println("arr2 기존 - " + Arrays.toString(arr2));
		arr2 = ArrayUtil.add(arr2, 23);
		System.out.println("arr2 추가 - " + Arrays.toString(arr2));
		arr2 = ArrayUtil.remove(arr2, 0);
		System.out.println("arr2 삭제 - " + Arrays.toString(arr2));
		System.out.println();

		/** PrductVo 객체 생성 => 정적 초기화는 객체가 최초실행일때 한번, 초기화 블럭은 객체가 생성될때마다 실행*/
		ProductVo v1 = new ProductVo("아메리카노", 3500);
		ProductVo v2 = new ProductVo("카페라떼", 4000);
		ProductVo[] productList = { v1, v2 };

		/** 품목코드를 확인 */
		System.out.println();
		for (ProductVo v : productList) {
			System.out.println("추가 전 ProductVo : " + v);
		}
		System.out.println();

		/** prductList에 객체 추가 */
		ProductVo v3 = new ProductVo("까페모카", 4500);
		System.out.println();
		productList = ArrayUtil.add(productList, v3);
		for(ProductVo v : productList){
			System.out.println("추가 후 ProductVo : " +  v);
		}
		System.out.println();

		/**
		 * 품목정보를 화면에 나타내기 위해 다음과 같은 타입 배열로 생성
		 * 	1.항목 정보 : String[]
		 *		2.제품 목록 : String[][]
		 */

		/** 1. 항목 정보 → String[] headerNames 변환 */
		String[] headerNames = ProductVo.TableInfo.HEADER_NAME_INFO;
		System.out.println("ProductVo 머리글 -  " + Arrays.toString(headerNames));

		/** 2. ProductVo[] productList → String[][] dataList 변환 */
		String[][] dataList = new String[productList.length][];
		for (int i = 0; i < dataList.length; i++) {
			dataList[i] = productList[i].getData();
		}

		/** 3. 너비 정보 → int[] widthInfo 변환 */
		int[] widthInfo = ProductVo.TableInfo.WIDTH_INFO;
		System.out.println("ProductVo 너비 - " + Arrays.toString(widthInfo));
	}
}