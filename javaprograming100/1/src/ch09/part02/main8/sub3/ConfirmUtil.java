package ch09.part02.main8.sub3;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConfirmUtil {
	/** 사용자가 업무를 처리를 할 수 있도록 ConfirmWindowWork 인터페이스를 파라미터로 지정 */
	public static void confirmWindow(IConfirm confirm) {

		/** 확인창 : 1('예' 선택), 2('아니오' 선택), 3('취소' 선택) */
		int showConfirmDialog = JOptionPane.showConfirmDialog(null, "자료를 저장하겠습니까?");

		/** '예' 선택 시 업무 처리 - 사용자가 정의한 yesWork()를 실행 */
		if (showConfirmDialog == 0) {
			String yesWork = confirm.yesWork();
			JOptionPane.showMessageDialog(null, yesWork);
		}
		/** '아니오' 선택 시 업무 처리 - 사용자가 정의한 noWork()를 실행 */
		else if (showConfirmDialog == 1) {
			String msg = confirm.noWork();
			JOptionPane.showMessageDialog(null, msg);
		}
		/** '취소' 선택 시 업무 처리 */
		else {
			JOptionPane.showMessageDialog(null, "취소하였습니다.");
		}
	}

}
