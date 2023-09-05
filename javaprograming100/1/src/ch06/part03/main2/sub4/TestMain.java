package ch06.part03.main2.sub4;

/*
2중 배열 생성 및 조회방법 코드
 */

public class TestMain {
	public static void main(String[] args) {

		/** 배열로 나타내기 */
  	String[][] array = { {"a001", "김철수", "010-1111-1111"}
										 , {"a002", "이영희", "010-2222-2222"}
										 , {"a003", "박남수", "010-3333-3333"} };

		/** for문으로 조회 */
		System.out.println("for문으로 조회하기");
		for(int i = 0; i<array.length; i++){
			System.out.println();
			for(int j = 0; j< array[i].length; j++){
				String data = array[i][j];
				System.out.println("\t조회되는 자료 " + data);
			}
		}

		/** 향상된 for문으로 조회 */
		System.out.println("\r\n향상된 for문으로 조회하기");
		for (String[] arr1 : array) {
			System.out.println();
			for (String data : arr1) {
				System.out.println("\t조회되는 자료 " + data);
			}
		}
	}
}