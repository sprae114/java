package ch14.part03.main3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestMain {
	public static void main(String[] args) {

		/** FixedThreadPool 쓰레드 풀 객체생성 */
		ExecutorService pool = Executors.newFixedThreadPool(3);

		/** Runnable 타입 객체생성 */
		Runnable r1 = new MyRunnable("쓰레드-1");
		Runnable r2 = new MyRunnable("쓰레드-2");

		/** Callable 타입 객체생성 */
		Callable<String> c1 = new MyCallable("쓰레드-3");
		Callable<String> c2 = new MyCallable("쓰레드-4");

		/** execute()로 실행 r1 실행 */
		pool.execute(r1);

		/** submit()로 r2, c1, c2 실행 */
		Future<?> submit = pool.submit(r2);
		Future submit2 = pool.submit(c1);
		Future submit3 = pool.submit(c2);

		System.out.println("쓰레드 종료");
	}

	/** Runnable 인터페이스 구현 MyRunnable 클래스 정의 */
	public static class MyRunnable implements Runnable {

		private String name;
		public MyRunnable(String name){
			this.name = name;
		}

		public void run() {
			for(int i=0; i<3; i++){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + "\t : " + i);
			}
		}
	}

	/** Callable 인터페이스 구현 MyCallable 클래스 정의 */
	public static class MyCallable implements Callable<String> {

		private String name;
		public MyCallable(String name){
			this.name = name;
		}

		@Override
		public String call() {
			for(int i=0; i<3; i++){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + "\t : " + i);
			}
			return null;
		}
	}
}