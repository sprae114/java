package ch17.part01.main3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestMain {
	public static void main(String[] args) {

		Connection conn = null;
    	PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			/** OracleDriver 클래스 로딩  → 정적초기화 작업 실행 */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			/** 오라클데이터베이스 네트워크 접속 후 Connection 객체생성 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection 연결 : " + conn);

			/** 품목단가가 4300원 초과되는 품목 100원인상 */
			String query = "UPDATE PRODUCT SET PRICE = PRICE+100 ";
			query += " WHERE PRICE > 4300 ";

			/** 쿼리실행을 위한 객체생성: PreparedStatement  */
			pstmt = conn.prepareStatement(query);

			/** executeUpdate()를 이용한 자료수정 */
			int result = pstmt.executeUpdate();
			pstmt.close();

			String query2 = "INSERT INTO PRODUCT";
			query2 += " (PRODUCT_NO, PRODUCT_NAME, PRICE)";
			query2 += " VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(query2);

			String[][] data = {  {"A004", "오렌지쥬스", "6000" }
											 , {"A005", "자몽쥬스", "6000" }
											 , {"A006", "키위쥬스", "6000" } };

			/** executeUpdate()를 이용한 자료등록 */
			for(int i = 0; i < data.length; i++){
				/** 파라미터 설정 */
				pstmt.setString(1, data[i][0]);
				pstmt.setString(2, data[i][1]);
 				pstmt.setString(3, data[i][2]);
				/** 쿼리는 일정하기 때문에 파라미터만 변경하여 쿼리실행 */
				pstmt.executeUpdate();
        pstmt.clearParameters(); /** 파라미터를 모두 비운다. */
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		/** PreparedStatement 종료 */
		try { if(pstmt!=null) pstmt.close(); }
		catch (SQLException e) { e.printStackTrace(); }

		/** Connection 종료 */
		try { if(conn!=null) conn.close(); }
		catch (SQLException e) { e.printStackTrace(); }
	}
}