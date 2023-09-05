package ch14.part02.main9.sub1;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {

		/** 자료를 CRUD 할 List 타입 객체생성 */
		List<Integer> list = new ArrayList<Integer>();

		Thread t1 = new Thread(){
			public void run() {
				/** list 마지막 자료삭제 */
				while(true){
					try { 	Thread.sleep(1); } catch (InterruptedException e){ break; }

					/** list 동기화 */
					synchronized( list ){
						if(list.size()>0){	list.remove(list.size()-1); 	}
					}
				}
			}
		};

		Thread t2 = new Thread(){
			public void run() {
				/** list 마지막 자료조회 */
				while(true){
					try { 	Thread.sleep(1); } catch (InterruptedException e){ break; }

					/** list 동기화 */
					synchronized( list ){
						int size = list.size();
						if(size>0){
							System.out.println("list size [" + list.size() + "]" +
													", 마지막 값 [" + list.get(size-1) + "], list " + list);
						}
					}
				}
			}
		};

		Thread t3 = new Thread(){
			public void run() {
				/** list 자료등록 */
				while(true){
					try { 	Thread.sleep(1); } catch (InterruptedException e){ break; }

					/** list 동기화 */
					synchronized( list ){
						list.add(list.size());
					}
					/** Thread에서 에러발생 시 모든 쓰레드를 종료시키기 위함
             			- 모든 쓰레드 interrupt() → 예외구간에서 『break;』로 함수종료
					*/
					if(t1.isAlive()==false || t2.isAlive()==false){
						t1.interrupt(); 	t2.interrupt(); interrupt();
					}
				}
			}
		};

		/** 쓰레드 시작 */
		t1.start(); 	t2.start();		t3.start();
	}
}