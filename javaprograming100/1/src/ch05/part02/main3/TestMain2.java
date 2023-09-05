package ch05.part02.main3;

/*
2중 for문 코드
 */

public class TestMain2 {
	public static void main(String[] args) {
		for(int i = 1; i<=9; i++){
			System.out.println(i+"단 ");
			for(int j =1; j<=9; j++){
				System.out.println("\t" + i + " * " + j + " = " + i*j);
			}
		}
	}
}
