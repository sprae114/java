package ch14.part02.main6.sub2;

import java.util.Date;

public class TestMain2 {
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

		boolean isStop = false;
		boolean isSuspend = false;

		public void run() {
			int count = 0;
			while(isStop==false){
				System.out.println("thread1 작업중");
				try { Thread.sleep(800); } catch (InterruptedException e) {}
				if(isSuspend){

					/** join() 함수를 이용하여 쓰레드 대기상태로 전환한다.
				     - 현재 이 쓰레드를 실행시키는 주체와 join()이 되는 쓰레드가 같다.
							 ‣ 자신이 자신에게 join() 함수 실행하므로 계속 대기된다.
					*/
					try {
						join();
					} catch (InterruptedException e) {	}

				}
				System.out.println("thread1 [" + (++count) + "]");
			}
		}

		public void threadStop(){ isStop = true; }
		public void threadSuspend(){ isSuspend = true; }
		public void threadResume() {
			isSuspend = false;

			/** join()에 의해 대기상태에 있는 쓰레드를 예외발생시켜 실행상태로 전환*/
			interrupt();
		}
	}

}