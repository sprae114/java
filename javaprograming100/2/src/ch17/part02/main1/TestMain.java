package ch17.part02.main1;

import java.util.Arrays;
import java.util.List;

public class TestMain {

	/** 메인함수 */
	public static void main(String[] args) {
		TestMain test = new TestMain();
		test.testQuery();
	}
	/** 테스트를 위한 함수 정의 */
	public void testQuery() {

		/** 전체 품목(PRODUCT) 품목조회 */
		List<String[]> executeQuery
			= DatabaseUtil.executeQuery("SELECT * FROM PRODUCT", null);
		for (String[] arr : executeQuery) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();

		/** 품목 중에 4500이하의 품목의 단가를 100원 인상 */
		String query2
			= "UPDATE PRODUCT SET PRICE = PRICE + ? WHERE PRICE <= ?";
		String[] arr2 = new String[]{"100", "4500"};
		DatabaseUtil.executeUpdate(query2, arr2);

		/** 품목코드가 ‘B001', 'B002', 'B003'인 품목이 있을 경우 삭제 */
		String query3
			= "DELETE FROM PRODUCT WHERE PRODUCT_NO IN ('B001', 'B002', 'B003')";
		DatabaseUtil.executeUpdate(query3, null);

		/** 품목등록 */
		String[][] data = {  {"B001", "오렌지쥬스", "6000" }
		 , {"B002", "자몽쥬스", "6000" }
		 , {"B003", "키위쥬스", "6000" } };
		String query4
			= "INSERT INTO PRODUCT(PRODUCT_NO, PRODUCT_NAME, PRICE) VALUES(?,?,?)";
		for(String[] arr : data){
			List<String> list2 = Arrays.asList(arr);
			DatabaseUtil.executeUpdate(query4, arr);
		}

		/** 전체 품목(PRODUCT) 품목조회  */
		List<String[]> executeQuery2
			= DatabaseUtil.executeQuery("SELECT * FROM PRODUCT");
		for (String[] arr : executeQuery2) {
			System.out.println(Arrays.toString(arr));
		}
	}
}