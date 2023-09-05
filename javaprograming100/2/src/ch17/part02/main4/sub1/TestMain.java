package ch17.part02.main4.sub1;

import ch17.part02.main4.sub1.TransactionManager.IAction;

public class TestMain {

	public static void main(String[] args){

		/** 트랜잭션 모듈함수의 사용 */
		TransactionManager.serviceCall( new IAction(){
			public void execute(){
				System.out.println("쓰기작업처리 로직구간");
			}
		});
	}
}