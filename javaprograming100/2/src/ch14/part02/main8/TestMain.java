package ch14.part02.main8;

public class TestMain  {

	/** MyThread 타입 정의 */
	public static class MyThread extends Thread {

		/** available, stop 속성 정의 */
		boolean available = true;
		boolean stop = false;

		/** 객체별로 우선순위를 설정할 수 있도록 생성자 함수 정의 */
		public MyThread(int priority){ this.setPriority(priority); }

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

		/** MyThread 타입 객체 3개 생성 - 우선순위 설정 */
		MyThread t1 = new MyThread(1);			/** 우선순위 가장 낮음 */
		MyThread t2 = new MyThread(5);			/** 우선순위 기본설정 */
		MyThread t3 = new MyThread(10);		/** 우선순위 가장 높음 */

		/** 쓰레드 모두 시작 */
		t1.start(); t2.start(); 	t3.start();

		/** 메인쓰레드 5초간 대기 */
		try { Thread.sleep(5000); } catch (InterruptedException e) { }

		/** 쓰레드 모두 종료 */
		t1.setStop(true); t2.setStop(true); t3.setStop(true);
	}
}