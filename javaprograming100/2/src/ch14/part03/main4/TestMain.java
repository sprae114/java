package ch14.part03.main4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestMain {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);
		Callable<String> c1 = new MyCallable("쓰레드-1", 2);
		Callable<String> c2 = new MyCallable("쓰레드-2", 3);
		Callable<String> c3 = new MyCallable("쓰레드-2", 4);

		List<Callable<String>> list = new ArrayList<Callable<String>>();
		Collections.addAll(list, c1, c2, c3);

		/** 【1】 invokeAll() 함수 사용 시 */
//		try {
//			List<Future<String>> invokeAll = pool.invokeAll(list);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}

		/** 【2】 invokeAll() 함수 사용 시 */
		try {
			pool.invokeAny(list);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}

		System.out.println("쓰레드 종료");
	}

	public static class MyCallable implements Callable<String> {
		private String title;
		private int count;
		public MyCallable(String title, int count){
			this.title = title; this.count = count;
		}
		@Override
		public String call() {
			String msg = Thread.currentThread().getName()+" "+ title ;
			for(int i=0; i<count; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("인터럽트" + Thread.currentThread().getName());
					e.printStackTrace();
				}
				System.out.println(msg + " " + i);
			}
			return msg ;
		}
	}
}