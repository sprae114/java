package ch11.part03.main2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

	/** 경로부여 → 파일읽기 → 읽은 내용 List<String> 저장 및 반환 */
	public List<String> method1(String path) throws Exception {
		List<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(path));
		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			list.add(readLine);
		}
		br.close();
		return list;
	}

	/** 경로부여 → 파일읽기 → 읽은 내용 StringBuffer 저장 및 반환 */
	public StringBuffer method2(String path) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new FileReader(path));
		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			if (sb.length() == 0) {
				sb.append(readLine);
			} else {
				sb.append("\r\n" + readLine);
			}
		}
		br.close();
		return sb;
	}

	public static void main(String[] args) throws Exception {

		/** 경로설정 */
		String path = "src/ch11/part03/main2/TestMain.java";
		TestMain testMain = new TestMain();

		/** method1() 함수를 이용하여 파일읽기 */
		List<String> method1 = testMain.method1(path);
		for (String s : method1) {
			System.out.println(s);
		}
		System.out.println();

		/** method2() 함수를 이용하여 파일읽기 */
		StringBuffer method2 = testMain.method2(path);
		System.out.println(method2);

	}
}