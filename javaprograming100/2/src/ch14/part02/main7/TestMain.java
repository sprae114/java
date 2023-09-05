package ch14.part02.main7;

public class TestMain  {

	/** MyThread 타입 정의 */
	public static class MyThread extends Thread {

		/** available, stop 속성 정의 */
		boolean available = true;
		boolean stop = false;
		public void setAvailable(boolean available){ this.available = available; }
		public void setStop(boolean stop){ this.stop = stop; }

		/** run() 함수 재정의 */
		public void run() {
			String name = Thread.currentThread().getName();
			int count = 0;

			/** stop이 true일 경우에는 쓰레드 메인로직 종료 */
			while(!stop){

				/** available이 false의 경우 Thread.yield() 실행 */
				if(available){
					System.out.println(name+" Thread 실행[" + (++count)+"]");
				}else{
					System.out.println(name+" yield() 실행[" + (++count)+"]");
					Thread.yield();
				}
			}
		}
	}

	public static void main(String[] args) {

		/** MyThread 타입 객체 6개 생성 */
		MyThread t1 = new MyThread(); 	MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();	MyThread t4 = new MyThread();
		MyThread t5 = new MyThread();	MyThread t6 = new MyThread();

		/** 쓰레드 모두 시작 */
		t1.start(); t2.start(); 	t3.start(); t4.start(); t5.start(); t6.start();

		/** t1 쓰레드 available 속성 false 지정 → Thread.yield();
		t1.setAvailable(false);

		/** 메인쓰레드 5초간 대기 */
		try { Thread.sleep(5000); } catch (InterruptedException e) { }

		/** 쓰레드 모두 종료 */
		t1.setStop(true); t2.setStop(true); t3.setStop(true);
		t4.setStop(true); t5.setStop(true); t6.setStop(true);
	}
}