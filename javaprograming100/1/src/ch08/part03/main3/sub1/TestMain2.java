package ch08.part03.main3.sub1;

import java.io.File;

public class TestMain2 {
	public static void main(String[] args) {

		/** C드라이브 경로설정 */
		String path = "c://";

		/** File 객체생성 */
		File file = new File(path);

		/** 해당 디렉토리에 하위에 있는 File 객체목록을 조회 */
		File[] files = file.listFiles();
		if (files != null) {
			/** File 객체목록 상세내역 조회 */
			for (File f : files) {
				String name = f.getName();
				String isFile = (file.isFile() == true ? "파일" : "폴더");
				System.out.println(isFile + "\t" + name);
			}
		}
	}
}
