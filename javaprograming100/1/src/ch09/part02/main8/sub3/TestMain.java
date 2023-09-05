package ch09.part02.main8.sub3;

public class TestMain {
	public static void main(String[] args) {

		ConfirmUtil.confirmWindow(new IConfirm() {

			@Override
			public String yesWork() {
				/** '예' 처리를 위한 로직 구현 (생략) */
				return "'예'를 선택하였습니다.";
			}

			@Override
			public String noWork() {
				/** '아니오' 처리를 위한 로직 구현 (생략) */
				return "'아니오'를 선택하였습니다.";
			}
		});

		// ConfirmUtil.confirmWindow(null, new ConfirmWindowWork() {
		//
		// @Override
		// public String yesWork() {
		// // TODO Auto-generated method stub
		// /** '예' 처리를 위한 로직 구현 (생략) */
		// return "'예'를 선택하였습니다.";
		// }
		//
		// @Override
		// public String noWork() {
		// // TODO Auto-generated method stub
		// /** '예' 처리를 위한 로직 구현 (생략) */
		// return "'아니오'를 선택하였습니다.";
		// }
		// });
	}
}