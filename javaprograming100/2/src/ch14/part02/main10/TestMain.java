package ch14.part02.main10;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** list 객체생성 */
		List<Integer> list = new ArrayList<Integer>();

		/** Thread t1 객체생성 */
		Thread t1 = new Thread(){
			public void run() {
				while(true){

					/** list 객체 동기화 - 해당 객체 wait() */
					synchronized (list){
						System.out.println("쓰레드1 wait");
						try { 	list.wait();	} catch (InterruptedException e) { }
					}
					System.out.println("쓰레드1 실행");
				}
			}
		};

		/** Thread t2 객체생성 */
		Thread t2 = new Thread(){
			public void run() {
				while(true){

					/** list 객체 동기화 - 해당 객체 wait() */
					synchronized (list){
						System.out.println("쓰레드2 wait");
						try { 	list.wait();	} catch (InterruptedException e) { }
					}
					System.out.println("쓰레드2 실행");
				}
			}
		};

		/** Thread t3 객체생성 */
		Thread t3 = new Thread(){
			public void run() {
				//while(true){
				try { 	Thread.sleep(3000); 	} catch (InterruptedException e) { }

				/** list 객체 동기화 - 해당 객체 notify(), notifyAll() */
				synchronized (list) {
					/** 【1】 또는 【2】의 코드로 실행 */
					//list.notify(); // 【1】
					list.notifyAll(); // 【2】
				}
				//}
			}
		};

		/** 쓰레드 시작 */
		t1.start();		t2.start();		t3.start();
	}
}