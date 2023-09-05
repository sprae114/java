package ch17.part01.main7;

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

		/** 커밋될 경우에 isSuccess 값을 true로 변경하며, false를 유지할 경우
			 로직의 마직에서 롤백을 하고자 함 */
		boolean isSuccess = false;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);

			/** 자동커밋 해제 */
			conn.setAutoCommit(false);

			/** 품목구매의 다음 전표번호를 발행하기 위한 쿼리 */
			String query1 = "";
			query1 += "SELECT NVL(MAX(ACCOUNT_NO),  ? || '00000' )+1 AS ACCOUNT_NO ";
			query1 += "\r\n FROM PRODUCT_PURCHASE ";
			query1 += "\r\n WHERE SUBSTR(ACCOUNT_NO,1,4) = ? ";
			pstmt = conn.prepareStatement(query1);
			pstmt.setString(1, "2019");
			pstmt.setString(2, "2019");
			System.out.println("쿼리1) " + query1 );
			rs = pstmt.executeQuery();
			String accountNo = null; /** 신규전표번호 */
			if(rs.next()){ accountNo = rs.getString("ACCOUNT_NO"); }
			System.out.println("신규전표번호 [" + accountNo + "]");

			/** 전표번호가 없을 경우 다음 쿼리로 넘기지 않고 rollback 처리 */
			if(accountNo==null || accountNo.equals("")){
				throw new Exception("오류발생 - 전표번호없음");
			}

			/** 품목구매 신규등록 */
			String query2 = "";
			query2 += "INSERT INTO PRODUCT_PURCHASE  ";
			query2 += "\r\n (ACCOUNT_NO, SALE_DATE, TOTAL) ";
			query2 += "\r\n VALUES (?, SYSDATE, ?) ";
			pstmt.close();
			pstmt = conn.prepareStatement(query2);
			pstmt.setString(1, accountNo);
			pstmt.setString(2, "18700"); /** int 타입이지만 String 타입으로 입력가능 */
			System.out.println("쿼리2) " + query2 );
			int result = pstmt.executeUpdate();	// 【쓰기1】

			/** 품목구매가 반드시 1개 INSERT 되어야 하며 그렇지 않을 경우 오류 */
			if(result!=1){
				throw new Exception("오류발생 - 품목구매 INSERT 오류발생 ");
			}

			/** 품목구매상세내역 등록 */
			String[][] data = {  {accountNo, "1", "A001", "4000", "1" }
											 , {accountNo, "2", "A002", "4300", "1" }
											 , {accountNo, "3", "A003", "4500", "1" } };
			String query3 = "";
			query3 += " INSERT INTO PRODUCT_PURCHASE_DETAIL  ";
			query3 += "\r\n (ACCOUNT_NO, SEQ, PRODUCT_NO, PRICE, QTY) ";
			query3 += "\r\n VALUES (?, ?, ?, ?, ?) ";
			pstmt.close();
			pstmt = conn.prepareStatement(query3);
			for(int i = 0; i < data.length; i++){

				/** 파라미터 설정 */
				pstmt.setString(1, data[i][0]);
				pstmt.setString(2, data[i][1]);
 				pstmt.setString(3, data[i][2]);
 				pstmt.setString(4, data[i][3]);
 				pstmt.setString(5, data[i][4]);
				/** 쿼리는 일정하기 때문에 파라미터만 변경하여 쿼리 실행 */
				pstmt.executeUpdate(); // 【쓰기2, 3, 4】
				System.out.println("쿼리3) " + query3 );
				pstmt.clearParameters(); /** 파라미터를 모두 비운다. */
			}

			/** 로직의 마지막까지 오류없이 올 경우에는 커밋 처리 */
			conn.commit();
			isSuccess = true;
		}
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		/** throw에 의해 일어난 오류는 여기로 오게 됨 */
		catch (Exception e) { e.printStackTrace(); }

		/** 커밋을 하지 못할 경우 롤백처리 */
		if(isSuccess==false){
			try { if(conn!=null) conn.rollback();
			} catch (SQLException e1) {	e1.printStackTrace(); }
		}

		/** 오토커밋 원래상태로 처리 */
		if(isSuccess==false){
			try { if(conn!=null) conn.setAutoCommit(true);
			} catch (SQLException e1) {	e1.printStackTrace(); }
		}

		/** ResultSet 종료 */
		try { if(rs!=null) rs.close(); }
		catch (SQLException e) { e.printStackTrace(); }

		/** PreparedStatement 종료 */
		try { if(pstmt!=null) pstmt.close(); }
		catch (SQLException e) { e.printStackTrace(); }

		/** Connection 종료 */
		try { if(conn!=null) conn.close(); }
		catch (SQLException e) { e.printStackTrace(); }
	}
}