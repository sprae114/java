package ch09.part03.main5.sub2;

import java.util.ArrayList;
import java.util.List;

public class ReadFileImpl extends AbstractReadFile {

	/** 파일경로를 설정하기 위한 getFilePath() 함수 재정의 */
	@Override
	public String getFilePath() {
		return "src/ch09/part03/main5/sub1/ReadProcess.java";
	}

	/** 파일을 한줄씩 읽어 로직처리하기 위한 process() 함수 재정의 */
	@Override
	public void process(String readLine) {
		if (readLine.trim().equals("") == false) {
			System.out.println(readLine);
		}
	}

	/** 메인함수 정의 */
	public static void main(String[] args) throws Exception {
		/** ReadFileImpl 객체생성 및 read() 함수호출 */
		ReadFileImpl r = new ReadFileImpl();
		r.read();
	}
}