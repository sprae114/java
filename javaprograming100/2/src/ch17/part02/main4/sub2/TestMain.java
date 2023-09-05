package ch17.part02.main4.sub2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import ch17.part02.main4.sub2.TransactionManager.IAction;

public class TestMain {

	/** 메인함수 */
	public static void main(String[] args) {
		/** 트랜잭션 처리를 위한 TransactionManager serviceCall() 사용 */
		TransactionManager.serviceCall(new IAction() {
			@Override
			public void execute() throws Exception {
				/** 쓰기함수는 이곳에서 처리한다. */
				new TestMain().testQuery();
			}
		});
	}
	/** 테스트를 위한 함수 정의 */
	public void testQuery()
		throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
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