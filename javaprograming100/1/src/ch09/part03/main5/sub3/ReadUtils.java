package ch09.part03.main5.sub3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadUtils {

	/** read() 함수 정의 - 경로와 읽기작업을 위한 인터페이스 파라미터 이용 */
	public static void read(String path, IReadProcess readProcess) throws Exception {

		/** 파일을 읽어오기 위한 객체생성 */
		BufferedReader br = new BufferedReader(new FileReader(path));

		/** 읽기 작업 */
		while (true) {

			/** 한 줄씩 읽어오기 */
			String readLine = br.readLine();
			/** 파일을 다 읽을 경우 null을 반환 → 루프 벗어나기 */
			if (readLine == null) {
				break;
			}
			/** 개별 기능 처리 */
			readProcess.execute(readLine);
		}
		/** 파일 읽기 종료 */
		br.close();
	}

	/** 기능목록 정의를 위한 인터페이스 정의 */
	public interface IReadProcess {
		/** 읽은 데이터를 처리하기 위한 추상메소드 정의 */
		public void execute(String readLine);
	}

	public static void main(String[] args) throws Exception {
		/** 경로설정 */
		String filePath = "src/ch09/part03/main5/sub1/ReadProcess.java";

		/** read() 함수로 파일읽기 - 경로와 읽기작업을 위한 익명클래스 객체 이용 */
		ReadUtils.read(filePath, new IReadProcess() {
			@Override
			public void execute(String readLine) {
				/** 상세로직구현 */
				if (readLine.trim().equals("") == false) {
					System.out.println(readLine);
				}
			}
		});
	}
}