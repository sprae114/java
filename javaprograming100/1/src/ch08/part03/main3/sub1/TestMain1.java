package ch08.part03.main3.sub1;

import java.io.File;


public class TestMain1 {
	public static void main(String[] args) {

		/** 물리파일의 경로설정 */
		String path = "c://tmp/test.txt";

		/** File 객체생성 */
		File file = new File(path);

		/** 해당 물리파일의 절대경로 조회 */
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath = " + absolutePath);

		/** 해당 물리파일의 파일명을 조회 */
		String name = file.getName();
		System.out.println("name = " + name);

		/** 해당 물리파일의 존재여부를 조회 */
		boolean exists = file.exists();
		System.out.println("exists = " + exists);

		/** 해당 물리파일이 파일타입인지 조회 */
		boolean isFile = file.isFile();
		System.out.println("isFile = " + isFile);

		/** 해당 물리파일이 디렉토리타입인지 조회 */
		boolean isDirectory = file.isDirectory();
		System.out.println("isDirectory = " + isDirectory);

	}
}