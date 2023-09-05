package ch14.part03.main5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestMain {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);

		pool.execute(new MyRunnable("thread1",2));
		pool.execute(new MyRunnable("thread2",4));
		pool.execute(new MyRunnable("thread3",6));

		/** 【1】 shutdown() 함수의 사용 - 주석해제해서 사용하시오. */
		//pool.shutdown();

		/** 【2】 shutdownNow() 함수의 사용 - 주석해제해서 사용하시오. */
		pool.shutdownNow();

		/** 【3】 awaitTermination() 함수의 사용 */
//		try {
//			boolean awaitTermination
//				= pool.awaitTermination(3500, TimeUnit.MILLISECONDS);
//			System.out.println("awaitTermination = " + awaitTermination);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("쓰레드 종료");
	}

	/** Runnable 인터페이스 구현 MyRunnable 클래스 정의 */
	public static class MyRunnable implements Runnable {
		private String title;
		private int count;
		public MyRunnable(String title, int count){
			this.title = title;
			this.count = count;
		}
		public void run(){

			String name = Thread.currentThread().getName() + "\t"+ title;
			for(int i = 0; i<count; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("InterruptedException발생 - " + name);
				}
				System.out.println(name + "\t" +i);
			}
		}
	}
}