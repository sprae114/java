package ch03.part09.main4;

/*
final 함수는 override할수 없다는 것을 설명하는 코드
 */

public class TestMain {
	public static void main(String[] args){
  	Child child = new Child();
		child.testMethod1();
		child.testMethod2();
		child.testMethod3();
	}
}