package ch10.part01.main6;

import java.io.File;
import java.io.FileNotFoundException;

public class TestMain {
	/** 【절차2】 예외를 위임 */
	public void read(String path) throws FileNotFoundException {
		File file = new File(path);
		boolean exists = file.exists();
		if (exists == false) {
			System.out.println("파일 존재 안함");
			/** 【절차1】 예외 발생시키기 */
			throw new FileNotFoundException("해당 파일이 존재하지 않습니다.");
		} else {
			System.out.println("파일 존재함");
		}
	}

	public static void main(String[] args) {
		try {
			/** read() 함수를 사용 시 예외처리 */
			new TestMain().read("d://test11.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}