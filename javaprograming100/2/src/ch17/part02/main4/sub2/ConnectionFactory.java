package ch17.part02.main4.sub2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	/** Connection 객체를 클래스영역에 저장하기 위해 정적전역변수 정의 */
	private static Connection conn = null;

	/** 외부에서 객체생성을 할 수 없도록 private 생성자함수 정의 */
	private ConnectionFactory(){}

	/** Connection 객체를 반환하는 함수를 제공
     - 객체생성 없이 해당 함수를 호출할 있도록 static 함수로 처리
     - 오류발생 시 사용자가 처리할 수 있도록 『throws』를 이용해 에러 위임
	*/
	public static Connection getInstance() throws ClassNotFoundException,
														SQLException, URISyntaxException, IOException {
		/** Connection 객체가 null 이거나 close() 된 이후 재호출 시 객체생성 */
		if(conn==null || conn.isClosed()){

			/** Properties 객체생성 */
			Properties prop = new Properties();

			/** db.properties 파일내용을 읽어서 Properties에 로딩 */
			URL resource = ConnectionFactory.class.getResource("/db.properties");
			FileReader fr = new FileReader(new File(resource.toURI()));
			prop.load(fr);

			/** Properties 속성 값 조회 */
			Class.forName(prop.getProperty("db.driver"));
			String url = prop.getProperty("db.url");
			String user = prop.getProperty("db.user");
			String pass = prop.getProperty("db.pass");
			conn = DriverManager.getConnection(url, user, pass);

		}
		return conn;
	}

	/** 자동커밋 기능해제 */
	public static void setAutoCommit(boolean auto)
		throws ClassNotFoundException, SQLException, URISyntaxException, IOException {

		/** 객체생성 및 자동커밋 기능해제 */
		conn = getInstance();
		conn.setAutoCommit(false);
	}

	/** 커밋기능 */
	public static void commit() throws SQLException{
		if(conn!=null) conn.commit();
	}
	/** 롤백기능 */
	public static void rollback() throws SQLException {
		if(conn!=null) conn.rollback();
	}
	/** 종료기능 */
	public static void close() throws SQLException {
		if(conn!=null)conn.close();
	}
}