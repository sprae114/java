package ch17.part02.main4.sub2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

  /** 1. 읽기 함수 예외위임처리 */
	public static List<String[]> executeQuery(String query, String... params) 		throws ClassNotFoundException, SQLException, URISyntaxException, IOException {

		/** 결과값을 담기위한 변수생성 */
		List<String[]> resultList = new ArrayList<String[]>();

		/** query의 값 검증 */
		if(query==null) return resultList;

		/** Connection → PreparedStatement executeQuery() → ResultSet */
		Connection conn = ConnectionFactory.getInstance();
		PreparedStatement pstmt = conn.prepareStatement(query);

		pstmt.clearParameters();

		/** 파라미터의 처리 */
		if(params!=null){
			int index = 0;
			for(String param : params){
				pstmt.setString(++index, param);
			}
		}

		/** 쿼리실행 후 결과조회 */
		ResultSet rs = pstmt.executeQuery();
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

		/** 종료작업 */
		if (rs != null)	rs.close();
		if (pstmt != null) 	pstmt.close();
		return resultList;
	}

  /** 2 쓰기 함수 예외위임처리 */
	public static int executeUpdate(String query, String... params)
		throws ClassNotFoundException, SQLException, URISyntaxException, IOException {

		/** 결과값을 반환하기 위한 변수 생성 */
		int resultCount = -1;

		/** 쿼리 검증하기 */
		if(query==null) return resultCount;

		/** Connection → PreparedStatement executeUpdate() */
		Connection conn = ConnectionFactory.getInstance();
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.clearParameters();

		/** 파라미터의 처리 */
		if(params!=null){
			int index = 0;
			for(String param : params){
				pstmt.setString(++index, param);
			}
		}

		/** 쿼리 실행 */
		resultCount = pstmt.executeUpdate();

		/** 종료작업 */
		if (pstmt != null) 	pstmt.close();

		return resultCount;
	}
}