package ch17.part02.main4.sub2;

import java.sql.SQLException;

public class TransactionManager {

	/** 트랜잭션 처리함수 */
	public static void serviceCall(IAction transactionManager){
		try{
			ConnectionFactory.setAutoCommit(false);
			transactionManager.execute();							// 【절차2】 쓰기작업실행
			ConnectionFactory.commit();								// 【절차3】 정상종료 커밋처리
			System.out.println("정상처리됨");
		}catch(Exception e){
			e.printStackTrace();
			try {
				ConnectionFactory.rollback();						// 【절차4】 오류 시 롤백
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("롤백됨");
		} finally {
			try {
				ConnectionFactory.close();								// 【절차5】 종료작업
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/** 로직을 처리하기 위해 인터페이스를 구현 */
	public interface IAction {
		public void execute() throws Exception;
	}
}