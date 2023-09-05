package ch18.part01.main2.sub5;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.Charset;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestMain {
	public static void main(String[] args) {
		
		/** 【1】 자료 요청을 위한 객체생성 및 기본설정 */
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create("https://www.naver.com"))
		      .build();
		
		/** 【2】 자료 전송을 위한 객체생성 */
		HttpClient client = HttpClient.newHttpClient();
		
		/** 응답자료 처리객체 생성 - 자료를 UTF-8로 인코딩 처리하여 String 타입으로 수신 */
		BodyHandler<String> ofString = BodyHandlers.ofString(Charset.forName("UTF-8"));

		/** 자료전송 및 HttpResponse 객체반환 */
		CompletableFuture<HttpResponse<String>> future 
			= client.sendAsync(request, ofString);

		/** HttpResponse의 body() 자료를 String으로 변환 */
		CompletableFuture<String> future2 
			= future.thenApply(new Function<HttpResponse<String>, String>() {
			@Override
			public String apply(HttpResponse<String> t) {
				return t.body();
			}
		});
		
		/** String 자료를 콘솔화면에 출력 */
		future2.thenAccept(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		/** 비동기 작업이 종료될 때까지 메인쓰레드 대기 */
		future2.join();
		
		System.out.println("자료 조회 종료");
	}
}