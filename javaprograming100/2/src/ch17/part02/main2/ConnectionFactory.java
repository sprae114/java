package ch17.part02.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	/** Connection 객체를 클래스영역에 저장하기 위해 정적전역변수 정의 */
	private static Connection conn = null;

	/** 외부에서 객체생성을 할 수 없도록 private 생성자함수 정의 */
	private ConnectionFactory(){}

	/** Connection 객체를 반환하는 함수를 제공
     - 객체생성 없이 해당 함수를 호출할 수 있도록 static 함수로 처리
     - 오류발생 시 사용자가 처리할 수 있도록 『throws』를 이용해 에러 위임
	*/
	public static Connection getInstance()
													throws ClassNotFoundException, SQLException {
		/** Connection 객체가 null 이거나 close() 된 이후 재호출 시 객체생성 */
		if(conn==null || conn.isClosed()){
			/** 객체생성 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javastudy";
			String pass = "oracle";
			conn = DriverManager.getConnection(url, user, pass);
		}
		return conn;
	}
}