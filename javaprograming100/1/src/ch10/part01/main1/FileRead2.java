package ch10.part01.main1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
	public static void read(String path) {
		BufferedReader br = null;
		/** 예외처리를 위한 try-catch-finally 구문 */
		try {
			br = new BufferedReader(new FileReader(path));
			while (true) {
				String readLine = br.readLine();
				if (readLine == null)
					break;
				System.out.println(readLine);
			}
		} catch (FileNotFoundException e) {
			/** 해당 파일의 경로에 파일이 없는 경우에 에러 처리 구간 */
			e.printStackTrace();
		} catch (IOException e) {
			/** 스트림을 이용하여 읽기/쓰기 작업 시 발생하는 에러 처리 구간 */
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		/** 해당 클래스를 갖는 java 파일을 읽기 */
		String path = "src/ch10/part01/main1/FileRead21.java";
		FileRead2 fr = new FileRead2();
		fr.read(path);
	}
}