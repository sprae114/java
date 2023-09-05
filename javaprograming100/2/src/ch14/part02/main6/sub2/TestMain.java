package ch14.part02.main6.sub2;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {

		final MyThread thread1 = new MyThread();
		thread1.start();

		/** 해당 로직의 앞의 예문과 동일하며 일시정지, 재시작, 종료의 함수만
			 변경하였다.
				- thread1.suspend()		→ thread1.threadSuspend()
				- thread1.resume()		→ thread1.threadResume();
				- thread1.stop()			→ thread1.threadStop();
		*/
		Thread thread2 = new Thread(){
			public void run() {

				/** 2초 대기 */
				System.out.println("thread2 2초간 대기");
				try { Thread.sleep(2000); } catch (InterruptedException e) {}

				/** thread1.threadSuspend() 이후 2초간 대기 */
				System.out.println("thread2 - thread1.suspend() 이후 2초간 대기");
				thread1.threadSuspend();
				try { Thread.sleep(2000); } catch (InterruptedException e) {}

				/** thread1 threadResume() 이후 2초간 대기 */
				System.out.println("thread2 - thread1.resume() 이후 2초간 대기");
				thread1.threadResume();
				try { Thread.sleep(2000); } catch (InterruptedException e) {}

				/** thread1 resume() 이후 2초간 대기 */
				System.out.println("thread2 - thread1.stop()");
				thread1.threadStop();

				System.out.println("thread2 종료");
			}
		};
		thread2.start();
	}

	public static class MyThread extends Thread {
		/** 쓰레드의 일시정지(suspend), 정지(stop) 상태를 가진 속성 정의 */
		boolean suspend = false;
		boolean stop = false;

		public void run() {
			int count = 0;
			/** 정지상태의 경우 메인로직을 갖는 루프를 벗어남 */
			while(stop==false){
				System.out.println("thread 작업중");
				try { Thread.sleep(800); } catch (InterruptedException e) {}
				/** 일시정지 상태의 경우 아래의 메인로직을 실행하지 않는다. */
				if(suspend) continue;

				System.out.println("threa1 [" + (++count) + "]");
			}
		}
		/** 쓰레드의 suspend(), resume(), stop() 기능을 대체하여 정의 */
		public void threadStop(){ stop = true; }
		public void threadSuspend(){ suspend = true; }
		public void threadResume() { suspend = false; }
	}
}