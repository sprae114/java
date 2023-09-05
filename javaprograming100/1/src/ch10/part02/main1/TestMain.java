package ch10.part02.main1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			/** 【절차1】 파일을 읽기 위한 객체생성 – 파일에 스트림 연결 */
			br = new BufferedReader(new FileReader("d://test.txt"));
			/** 【절차2】 파일 읽기 작업 */
			while (true) {
				String readLine = br.readLine(); /** 파일에서 읽어오기 */
				if (readLine == null)
					break; /** null이 나오면 다 읽은 것임 */
				System.out.println(readLine); /** 읽은 내용을 콘솔에 나타내기 */
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			/** 【절차3】 파일 스트림 닫기 */
			if (br != null)
				br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}