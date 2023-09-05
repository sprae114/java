package ch08.part03.main3.sub3;

import java.io.File;
import java.util.ArrayList;


public class TestMain {

	/** 파일의 정보를 받아와 하위 폴더 및 파일의 목록을 조회 */
	public static void scan(File file, ArrayList<File> fileList) {

		/** File 객체가 null 또는 존재하지 않는 파일 정보일 때 종료 */
		if (file == null || file.exists() == false){ return; }

		/** 폴더의 경우 다시 하위폴더 조회 */
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null) {
				for (File f : files) {
					/** 파일의 정보를 받아와 하위 폴더 및 파일의 목록을 조회 */
					scan(f, fileList);
				}
			}
		}
		/** 파일의 경우 파일의 정보를 조회 */
		else {
			String isFile = (file.isFile() == true ? "파일" : "폴더");
			String name = file.getName();
			String path = file.getAbsolutePath();
			//System.out.println(isFile + "\t" + name + "\t" + path);

			/** 파일의 경우이므로 fileList에 자료를 담는다. */
            fileList.add(file);
		}
	}

	public static void main(String[] args) {

		/** 해당 폴더 및 하위폴더의 정보를 가져오기 */
		String rootPath = "d://03.프로그램"; /** 개인 특정폴더를 지정하자. */

		/** File 객체생성 */
		File file = new File(rootPath);

		ArrayList<File> list = new ArrayList<File>();

		/** scan() 함수호출 */
		scan(file, list); /** ☞ list를 파라미터로 보내 해당 함수에서 추가 */

		/** 전체목록 조회 */
		for (File f : list) {
			String isFile = (file.isFile() == true ? "파일" : "폴더");
			String name = file.getName();
			String path = file.getAbsolutePath();
			System.out.println(f.isFile() + "\t" + name + "\t" + path);
		}

	}
}