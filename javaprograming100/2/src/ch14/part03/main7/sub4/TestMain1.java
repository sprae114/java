package ch14.part03.main7.sub4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestMain1 {

	/** start에서 end의 값까지 합산한 값을 반환하는 함수 정의 */
	public static int print(int start, int end, String title) {
		System.out.println(title + " 함수시작");
		int sum = 0;
		for(int i = start; i<=end; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { 	e.printStackTrace(); }
			sum += i;
			System.out.println(title + " : i = [" + i + "], sum = ["+sum+"]");
		}
		System.out.println(title + " 함수종료");
		return sum;
	}

	/** 메인함수 정의 */
	public static void main(String[] args) {
		
		/** Supplier 구현 객체를 이용하여 supplyAsync() 함수 실행 */
		CompletableFuture<Integer> future1 
			= CompletableFuture.supplyAsync(()->{
				return print(1,3,"supplyAsync1()");
			});

		/** thenCompose() 함수를 이용하여 비동기 작업 이후 비동기 작업 실행 */
		CompletableFuture<String> future2 = future1.thenCompose(t->{
			return CompletableFuture.supplyAsync(()->{
				return "결과 = " + print(t, t+1,"supplyAsync2()");
			});
		});
		
		/** future2의 결과 값이 나타날 때까지 메인쓰레드를 대기시킨다. */
		String join = future2.join();
		System.out.println("future2 결과 값 = " + join);
		
		System.out.println();
		
		
		/** 위의 과정을 아래와 같이 하나로 연결된 함수로 나탄낼 수 있다. */
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->{
			return print(1,3,"supplyAsync1()");
		}).thenCompose(t->{
			return CompletableFuture.supplyAsync(()->{
				return "결과 = " + print(t, t+1,"supplyAsync2()");
			});
		});
		
		/** future3의 결과 값이 나타날 때까지 메인쓰레드를 대기시킨다. */
		String join2 = future3.join();
		System.out.println("future2 결과 값 = " + join2);
		
	}
}