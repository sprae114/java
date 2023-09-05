package ch10.part01.main1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead1 {
	/** 읽기 함수 생성 - 『throws를 이용한 IOException 예외처리』 */
	public static void read(String path) throws FileNotFoundException, IOException {
		/** 읽기절차1 : 읽기 객체 생성 */
		BufferedReader br = new BufferedReader(new FileReader(path));
		/** 읽기절차2 : 파일 읽기 */
		while (true) {
			String readLine = br.readLine();
			if (readLine == null)
				break;
			System.out.println(readLine);
		}
		/** 읽기절차3 : 파일 읽기 종료 */
		br.close();
	}

	/** fr.read()에서 예외선언된 부분의 예외처리를 위해 main() 함수에 예외선언 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "src/ch10/part01/main1/FileRead1.java";
		FileRead1 fr = new FileRead1();
		fr.read(path);
	}
}