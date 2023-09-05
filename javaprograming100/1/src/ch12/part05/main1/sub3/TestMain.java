package ch12.part05.main1.sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {

		/** Properties 객체생성 */
		Properties prop = new Properties();

		FileInputStream fis = null;
		try {

			String str = TestMain.class.getPackage().getName().replace(".", "/");
			System.out.println(str);

			/** FileInputStream 객체생성 */
			fis = new FileInputStream("src/ch12/part05/main1/sub3/conf.properties");

			/** 파일내용을 prop에 저장하기 */
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/** FileInputStream 종료 */
		try {
			if(fis!=null) fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/** Properties 자료 읽기 */
		Set<Object> keySet = prop.keySet();
		for(Object o : keySet){
			String property = prop.getProperty((String)o);
			System.out.println(o + " : " + property);
		}
	}
}