package ch14.part03.main7.sub6;

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
				
		/** allOf() 함수의 사용 - 비동기 함수 통합실행 */		
		CompletableFuture.allOf(
			CompletableFuture.supplyAsync(()->{
				return print(1,2,"supplyAsync1()");
			})
			,CompletableFuture.supplyAsync(()->{
				return print(3,6,"supplyAsync2()");
			})
			,CompletableFuture.supplyAsync(()->{
				return print(7,11,"supplyAsync3()");
			})
		).join();
				
		
		/** allOf() 함수의 사용 - 비동기 함수 통합실행 */		
		Object join2 = CompletableFuture.anyOf(
			CompletableFuture.supplyAsync(()->{
				return print(1,2,"supplyAsync4()");
			})
			,CompletableFuture.supplyAsync(()->{
				return print(3,6,"supplyAsync5()");
			})
			,CompletableFuture.supplyAsync(()->{
				return print(7,11,"supplyAsync6()");
			})
		).join();
		System.out.println("anyOf 결과 값 = " + join2);		
	
	}
}