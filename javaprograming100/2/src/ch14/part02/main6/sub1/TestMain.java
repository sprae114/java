package ch14.part02.main6.sub1;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {

		final MyThread thread1 = new MyThread();
		thread1.start();

		Thread thread2 = new Thread(){
			public void run() {
				/** 2초 대기 */
				System.out.println("thread2 2초간 대기");
				try { Thread.sleep(2000); } catch (InterruptedException e) {}

				/** thread1 suspend() 이후 2초간 대기 */
				System.out.println("thread2 - thread1.suspend() 이후 2초간 대기");
				thread1.suspend();
				try { Thread.sleep(2000); } catch (InterruptedException e) {}

				/** thread1 resume() 이후 2초간 대기 */
				System.out.println("thread2 - thread1.resume() 이후 2초간 대기");
				thread1.resume();
				try { Thread.sleep(2000); } catch (InterruptedException e) {}

				/** thread1 resume() 이후 2초간 대기 */
				System.out.println("thread2 - thread1.stop()");
				thread1.stop();

				System.out.println("thread2 종료");
			}
		};
		thread2.start();
	}
	public static class MyThread extends Thread {
		public void run() {
			int count = 0;
			while(true){
				System.out.println("thread 작업중");
				try { Thread.sleep(800); } catch (InterruptedException e) {}
				System.out.println("thread1 [" + (++count) + "]");
			}
		}
	}
}