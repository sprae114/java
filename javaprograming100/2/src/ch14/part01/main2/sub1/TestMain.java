package ch14.part01.main2.sub1;

public class TestMain {

	public static void main(String[] args) {

			/** 메인함수 시작 */
			System.out.println("메인함수 실행");

			/** Thread 상속을 통한 객체생성 */
			Thread thread1 = new MyThread("thread1",1000);
			Thread thread2 = new MyThread("thread2",700);

			/** Runnable 타입 객체를 이용한 Thread 객체생성 */
			Thread thread3 = new Thread(new MyRunnable("thread3",300));

			/** 쓰레드 실행 */
			thread1.start(); /** 쓰레드생성 → 다음 행으로 이동 */
			thread2.start(); /** 쓰레드생성 → 다음 행으로 이동 */
			thread3.start(); /** 쓰레드생성 → 다음 행으로 이동 */

			/** 메인함수 종료 */
			System.out.println("메인함수 종료");
		}
}