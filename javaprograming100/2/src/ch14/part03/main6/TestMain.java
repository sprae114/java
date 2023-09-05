package ch14.part03.main6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMain {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(1);

		/** 작업 생성 - submit() 함수 - Callable 파라미터 이용 */
		Future<String> future1 = pool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception { return print("쓰레드1", 3); }
		});

		/** 작업 생성 - submit() 함수 - Runnable 파라미터 이용 */
		Future future2 = pool.submit(new Runnable() {
			@Override
			public void run() { print("쓰레드2", 3); }
		});

		/** 작업 생성 - submit() 함수 - Runnable 파라미터 이용 */
		final Future future3 = pool.submit(new Runnable() {
			@Override
			public void run() { print("쓰레드3", 3);	}
		});

		/** Future get() 함수이용 - 종료될 때까지 대기한다. */
		try {
			String result = future1.get();
			System.out.println("결과 값 = " + result);
		}
		catch (InterruptedException e) { e.printStackTrace(); }
		catch (ExecutionException e) { e.printStackTrace(); }

		/** Future get() 함수이용 - 종료될 때까지 대기한다. */
		try { Thread.sleep(1000); } catch (InterruptedException e1) { }
		boolean cancel = future3.cancel(true);

		/** Future get() 함수이용 - 종료될 때까지 대기한다. */
		try {
			Object result2 = future2.get();
			System.out.println("결과 값 = " + result2);
		}
    catch (InterruptedException e) { e.printStackTrace(); }
		catch (ExecutionException e) { e.printStackTrace(); }

		System.out.println("메인 쓰레드 종료");
	}

	/** 쓰레드별로 처리 함수 */
	public static String print(String title, int count){
		String name = Thread.currentThread().getName();
		for(int i = 0; i<count; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("\t "+title+", 예외발생 [" + name + "]");
			}
			System.out.println(title+", " + name+"["+i+"]");
		}
		return "쓰레드종료 " + title+", " + name;
	}
}