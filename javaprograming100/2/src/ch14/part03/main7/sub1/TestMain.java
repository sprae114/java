package ch14.part03.main7.sub1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestMain {
	public static void main(String[] args) {
		
		/** 【1】 CompletableFuture future 객체생성 */ 
		CompletableFuture future = new CompletableFuture();
		
		/** 【2】 Thread 정의 및 run() 함수 재정의 및 쓰레드 시작 */
		new Thread(){
			public void run() {
				
				int sum = 0;
				for(int i = 1; i<=3; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					sum += i;
					System.out.println("i = [" + i + "], sum = ["+sum+"]");
				}
				
				/** 【3】 run() 함수 종료 시 결과 값을 future에 저장 */
				future.complete(sum);
				
			}
		}.start();
		System.out.println("쓰레드 start() 완료");		

		/** 쓰레드가 실행되어 complete() 결과 값이 반환될 때까지 대기 */
		try {
			/** 【4】 future.get() 또는 future.join() 함수로 결과 값을 불러오기  */
			Object object = future.get();
			System.out.println("결과 값 = " + object);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	
		/** 【4】 future.get() 또는 future.join() 함수로 결과 값을 불러오기  */
		Object join = future.join();
		System.out.println("결과 값 = " + join);

		System.out.println("메인함수 종료");		
	}
}
