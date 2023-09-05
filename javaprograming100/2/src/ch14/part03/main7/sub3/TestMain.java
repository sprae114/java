package ch14.part03.main7.sub3;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class TestMain {

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
		
		/** 1. Supplier 구현 객체를 이용하여 supplyAsync() 함수 실행 */
		CompletableFuture<Integer> future1 
			= CompletableFuture.supplyAsync(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return print(1,5,"supplyAsync1()");
			}
		});

		/** 2. Supplier 구현 객체를 이용하여 supplyAsync() 함수 실행 */
		CompletableFuture<Integer> future2 
			= CompletableFuture.supplyAsync(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return print(6,10,"supplyAsync2()");
			}
		});
		
		
		/** future1과 future2의 비동기 작업 이후 두 결과 값을 후처리 후 CompletableFuture 객체반환 */
		CompletableFuture<String> future3 = future2.thenCombine(future1, new BiFunction<Integer, Integer, String>() {
			@Override
			public String apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return String.valueOf(t+u);
			}
		});
		
		
		/** future1, future2의 결과 값이 나타날 때까지 메인쓰레드를 대기시킨다. */
		String join = future3.join();
		System.out.println("future3 결과 값 = " + join);
	}
}