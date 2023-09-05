package ch17.part01.main1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {
	public static void main(String[] args) {

		Connection conn = null;
    PreparedStatement pstmt = null;
		try {
			/** OracleDriver 클래스 로딩  → 정적초기화 작업실행 */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			/** 오라클데이터베이스 네트워크 접속 후 Connection 객체생성 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection 연결 : " + conn);

			/** 쿼리실행을 위한 객체생성: PreparedStatement  */
			String query = "SELECT * FROM PRODUCT";
			pstmt = conn.prepareStatement(query);

			/** 등록, 수정, 삭제, 조회 작업을 여기에서 한다. */

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