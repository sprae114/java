package ch17.part02.main4.sub1;

public class TransactionManager {
	public static void serviceCall( IAction action ){

		/** 트랜잭션 시작 로직구성 */
		System.out.println("트랜잭션 시작 로직구성");

		/** 쓰기작업 */
		action.execute();

		/** 트랜잭션 종료 로직구성 */
		System.out.println("트랜잭션 종료 로직구성");
	}
	public interface IAction {
		public void execute();
	}
}