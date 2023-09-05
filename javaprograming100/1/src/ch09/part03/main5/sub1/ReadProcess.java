package ch09.part03.main5.sub1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadProcess {
	public static void main(String[] args) throws Exception {
		/** 현재의 파일을 읽기 위한 경로 설정 */
		String filePath = "src/ch09/part03/main5/sub1/ReadProcess.java";
		/** 파일을 읽을 클래스 객체생성 */
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		/** 파일 읽기 작업 - 무한루프 */
		while (true) {
			/** 한 줄씩 읽어오기 */
			String readLine = br.readLine();
			/** 파일을 다 읽을 경우 null을 반환 → 루프 벗어나기 */
			if (readLine == null) {
				break;
			}
			/** 분리하고자 하는 로직 시작 구간 */
			if (readLine.trim().equals("") == false) {
				System.out.println(readLine);
			}
			/** 분리하고자 하는 로직 종료 구간 */
		}
		/** 파일 읽기 종료 */
		br.close();
	}
}
