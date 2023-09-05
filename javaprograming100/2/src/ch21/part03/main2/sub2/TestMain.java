package ch21.part03.main2.sub2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
	public static void main(String[] args) throws Exception {

		/** 해당 클래스 정보를 이용하여 파일의 내용을 읽어오기 */
		String str = readFile(TestMain.class);

		System.out.println("----------------------------");

		/** 【절차1】 정규식을 이용하기 위한 Matcher 객체생성 */
		String pattern = "new\\s+([^\\(\\[]+)(\\(|\\[)";
		Matcher matcher = Pattern.compile(pattern).matcher(str);
		int count = 0;
		/** 【절차2】 검색패턴 일치 문자열을 찾을 때까지 반복  */
		while(matcher.find()){
			/** 【절차3】 반복문 내에서 찾은 문자열 정보 추출 - 전체 문자열 */
			System.out.println((++count) + "번째 검색 ");
			// System.out.println("\t전체 검색 값 = " + matcher.group());
			System.out.println("\t그룹1 검색 값 = " + matcher.group(1));
		}
	}

	/** 파일을 읽기 위한 함수 */
	public static String readFile(Class clazz) throws Exception{

		/** 클래스의 정보를 읽어와 경로를 구현
        - 운영시스템에서는 java 파일이 넘어가지 않기 때문에 개발에서만 가능함.
		*/
		String name = TestMain.class.getName();
		name = "src/"+name.replace(".", "/")+".java";
		System.out.println("파일상대경로 = " + name);

		/** 학습을 위해  파일읽기를 2가지로 처리함 - 직접 1 또는 2 선택가능 */
		int type = 2; // 1 : FileInputStream 처리, 2 : FileReader로 처리
		String str = "";

		if(type==1){

			/** 방법1: FileInputStream으로 읽어서 처리
				 - FileInputStream → BufferedInputStream read()
           → ByteArrayOutputStream write() → byte[] → String
      */
			BufferedInputStream bis
				= new BufferedInputStream(new FileInputStream(name));
			ByteArrayOutputStream bias = new ByteArrayOutputStream();
			byte[] by = new byte[1024];
			while(true){
				int read = bis.read(by);
				if(read==-1) break;
				bias.write(by, 0, read);
			}
			byte[] byteArray = bias.toByteArray();
			str = new String(byteArray);
		}else {

			/** 방법2: FileReader로 읽어서 처리
				 - FileReader → BufferedReader readLine()
           → StringBuffer append() → String
      */
			BufferedReader br = new BufferedReader(new FileReader(name));
			StringBuffer sb = new StringBuffer();
			while(true){
				String readLine = br.readLine();
				if(readLine==null) break;
				sb.append(readLine+"\r\n");
			}
			str = sb.toString();
		}
		return str;
	}
}