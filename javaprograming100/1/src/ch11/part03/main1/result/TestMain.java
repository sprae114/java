package ch11.part03.main1.result;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public void read() throws Exception {

		/** 1) 파일의 경로(path)를 지정 */
		String path = "src/ch11/part03/main1/TestMain.java";

		/** 【절차1】 분리구간 시작 **************************************************/
		/** 【절차2】 해당구간의 로직을 readFile() 함수로 이동 */
		/** 【절차4】 로직구간에서 분리한 로직대신에 함수사용 */
		/** 【절차5】 readFile()의 반환타입을 이용하여 자료연결 */
		List<String> list = readFile(path);
		/** 【절차1】 분리구간 종료 **************************************************/

		/** 6) list 내용 확인 */
		int line = 1;
		for(String s : list){
			System.out.println((line++) + "\t" + s);
		}
	}

	/** 【절차2】 분리할 함수 정의 */
	/** 【절차5】 함수의 파라미터를 이용한 자료연결 */
	private List<String> readFile(String path) throws Exception {

		/** 【절차3】 해당구간의 로직을 readFile() 함수로 이동 */
		/** 2) 읽을 내용을 저장할 객체생성 */
		List<String> list = new ArrayList<String>();
		/** 3) 읽기 객체생성(BufferedReader br)  */
		BufferedReader br = br = new BufferedReader(new FileReader(path));
		/** 4) 읽은 자료를 list에 저장 */
		while(true){
			String readLine = br.readLine();
			if(readLine==null){ break; }
			list.add(readLine);
		}
		/** 5) 읽기 객체 스트림 종료 */
		if(br!=null) br.close();
		/** 분리구간 종료 **************************************************/
		/** 【절차5】 함수의 파라미터를 이용한 자료연결 */
		return list;
	}

	public static void main(String[] args) throws Exception {
		new TestMain().read();
	}

}