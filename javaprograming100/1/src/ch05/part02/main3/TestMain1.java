package ch05.part02.main3;

/*
배열을 이용한 for 반복문 설명
 */

public class TestMain1 {
	public static void main(String[] args) {

		String[] arr = new String[]{"a", "b", "c"};

		for(int i = 0; i<arr.length; i++){
			System.out.println("arr["+i+"] = " + arr[i]);
		}
		System.out.println();

		for (String s : arr) {
			System.out.println("자료조회 = " + s);
		}

	}
}
