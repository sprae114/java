package ch14.part02.main3;

public class TestMain {

	public static void main(String[] args) {

		/** 쓰레드 객체생성 */
		Thread thread1 = new MyThread("thread1", 3);
		Thread thread2 = new MyThread("thread2", 3);
		Thread thread3 = new MyThread("thread3", 3);
		Thread thread4 = new MyThread("thread4", 3);

		/** thread1, thread2 쓰레드 시작 */
		thread1.start(); /** 약1초 */
		thread2.start(); /** 약2초 */

		/** thread1, thread2가 종료될 때까지 대기 - 다음으로 넘어가지 않음 */
		try {
			thread1.join();
			thread2.join();
			System.out.println("thread1,2 join()");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/** thread3 쓰레드 시작 */
		thread3.start(); /** 약3초 */

		/** thread3이 종료될 때까지 대기 - 다음으로 넘어가지 않음 */
		try {
			thread3.join();
			System.out.println("thread4 join()");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/** thread4 쓰레드 시작 */
		thread4.start(); /** 약4초 */
	}

	/** Thread 상속 내부 클래스 정의
      - main() 함수는 static 함수이며 내부에서 사용하기 위해서는 구성요소가 static이어야 하기 때문에 class 정의 시 static으로 정의하였음
	*/
	public static class MyThread extends Thread {
		private int count;
		public MyThread(String name, int count){
			this.count = count;
			setName(name);
		}
		/** run() 함수 재정의(Override) */
		public void run(){
			Thread thread = Thread.currentThread();
			for(int i = 0; i<count; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(thread.getName()+" [ " + (i+1) + " ]");
			}
		}
	}
}