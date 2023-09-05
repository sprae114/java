package ch06.part03.main2.sub3;

/*
2중 배열 생성 및 조회 방법 코드
 */

public class TestMain {
	public static void main(String[] args) {
		String[] arr1 = {"자료11", "자료12", "자료13"};
		String[] arr2 = {"자료21", "자료22", "자료23"};
		String[][] arr = { arr1, arr2 };

		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				String data = arr[i][j];
				System.out.println("arr["+i+"]["+j+"] = " + data);
			}
		}

		for(String[] array : arr){
			for(String s : array){
				System.out.println("arr 자료접근 = " + s);
			}
		}
	}
}
