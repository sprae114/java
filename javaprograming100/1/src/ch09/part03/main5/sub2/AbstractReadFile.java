package ch09.part03.main5.sub2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractReadFile {

	/** 파일의 경로를 가져오기 위한 추상메소드 정의 */
	public abstract String getFilePath();

	/** 읽은 내용을 가지고 처리하기 위한 추상메소드 정의 */
	public abstract void process(String readLine);

	/** 파일읽기를 처리하기 위한 함수 */
	public void read() throws Exception {

		/** 읽기 객체생성 – getFilePath() 추상메소드 사용 */
		String filePath = getFilePath();

		/** 파일을 읽을 클래스 객체생성 */
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		/** 읽기 작업 */
		while (true) {
			/** 한줄씩 읽어오기 */
			String readLine = br.readLine();
			/** 파일을 다 읽을 경우 null을 반환 → 루프 벗어나기 */
			if (readLine == null) {
				break;
			}
			/** 추상메소드의 사용 */
			process(readLine);
		}
		/** 읽기 작업 종료 */
		br.close();
	}
}