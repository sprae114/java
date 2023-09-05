package ch17.part02.main1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseUtil {

  /** 1. 외부에서 조회쿼리와 파라미터를 부여 시 쿼리실행 후 조회결과를 반환하는 함수 */
	public static List<String[]> executeQuery(String query, String... params){

		/** 결과 값을 담기위한 변수생성 */
		List<String[]> resultList = new ArrayList<String[]>();

		/** query의 값 검증 */
		if(query==null) return resultList;

		/** Connection → PreparedStatement executeQuery() → ResultSet */
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement(query);
			pstmt.clearParameters();

			/** 파라미터의 처리 */
			if(params!=null){
				int index = 0;
				for(String param : params){
					pstmt.setString(++index, param);
				}
			}

			/** 쿼리실행 후 결과조회 */
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			/** 결과의 첫 행은 헤더정보를 입력 */
			String[] header = new String[rsmd.getColumnCount()];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				header[i] = rsmd.getColumnName(i+1);
			}
			resultList.add(header);

			/** 두 번째 행부터 자료담기 */
			while (rs.next()) {

				/** 결과 값을 반환하기 위해 String 배열을 컬럼 수만큼 만들어 생성 */
				String[] data = new String[rsmd.getColumnCount()];
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					data[i] = rs.getString(i + 1);
				}
				/** 한 행의 자료를 결과목록에 추가 */
				resultList.add(data);
			}
		}
		catch (ClassNotFoundException e) {	e.printStackTrace(); }
		catch (SQLException e) {	e.printStackTrace(); }

		/** 종료작업 */
		try { if (rs != null)	rs.close(); }
		catch (SQLException e) {	e.printStackTrace(); }
		try { 	if (pstmt != null) 	pstmt.close(); }
		catch (SQLException e) {	e.printStackTrace();	}
		try { 	if (conn != null) conn.close(); }
		catch (SQLException e) {	e.printStackTrace();	}

		return resultList;
	}

  /** 2. 외부에서 등록쿼리 또는 수정쿼리 또는 삭제쿼리와 파라미터를 부여 시 쿼리실행 후 영향을 받은 행의 수를 반환하는 함수 */
	public static int executeUpdate(String query, String... params){

		/** 결과 값을 반환하기 위한 변수 생성 */
		int resultCount = -1;

		/** 쿼리 검증하기 */
		if(query==null) return resultCount;

		/** Connection → PreparedStatement executeUpdate() */
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);
			pstmt = conn.prepareStatement(query);
			pstmt.clearParameters();

			/** 파라미터의 처리 */
			if(params!=null){
				int index = 0;
				for(String param : params){
					pstmt.setString(++index, param);
				}
			}

			/** 쿼리실행 */
			resultCount = pstmt.executeUpdate();
		}
		catch (ClassNotFoundException e) {	e.printStackTrace(); }
		catch (SQLException e) {	e.printStackTrace(); }

		/** 종료작업 */
		try { 	if (pstmt != null) 	pstmt.close(); }
		catch (SQLException e) {	e.printStackTrace();	}
		try { 	if (conn != null) conn.close(); }
		catch (SQLException e) {	e.printStackTrace();	}

		return resultCount;
	}
}