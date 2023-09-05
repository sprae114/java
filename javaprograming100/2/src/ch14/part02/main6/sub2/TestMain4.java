package ch14.part02.main6.sub2;

import java.util.Date;

public class TestMain4 {
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

					/** wait() 함수를 이용하여 쓰레드 대기상태로 전환한다. */
					synchronized (this){ /** this는 이 클래스의 객체이다. */
						try {
							wait();
						} catch (InterruptedException e) {
							System.out.println("wait() 함수 interrupt");
						}
					}

				}
				System.out.println("thread1 [" + (++count) + "]");
			}
		}

		public void threadStop(){ isStop = true; }
		public void threadSuspend(){ isSuspend = true; }
		public void threadResume() {
			isSuspend = false;

			/** notify(), notifyAll() 함수를 이용하여 쓰레드 실행상태로 전환한다.
	        	- wait() 함수에 의해 대기상태에 있는 쓰레드만 실행상태로 전환된다.
	        	- notify(), notifyAll()은 동기화 구간에서만 사용이 되며 동기화 방법 중에 다음과 같이 할 수 있으며, 곧바로 다룰 것이다.
	          		‣ synchronized ( 동기화할객체 ) {   처리구간  }
			*/
			synchronized(this){
				notifyAll();
			}
		}
	}

}