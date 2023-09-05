package ch10.part01.main7;

/** 사용자 예외클래스 정의 */
public class MyException extends Throwable {
	public MyException(String msg) {
		super(msg);
	}
}