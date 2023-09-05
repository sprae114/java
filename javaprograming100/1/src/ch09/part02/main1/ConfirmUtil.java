package ch09.part02.main1;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class ConfirmUtil {
	public static void confirmWindow(MainView component, ConfirmWindowWork confirm) {

		/** 확인창 : 1('예' 선택), 2('아니오' 선택), 3('취소' 선택) */
		int showConfirmDialog = JOptionPane.showConfirmDialog(component, "자료를 저장하겠습니까?");
		System.out.println(showConfirmDialog);
		/** '예' 선택 시 업무 처리 */
		if (showConfirmDialog == 0) {
			String yesWork = confirm.yesWork();
			JOptionPane.showMessageDialog(component, yesWork);
		}
		/** '아니오' 선택 시 업무 처리 */
		else if (showConfirmDialog == 1) {
			String msg = confirm.noWork();
			JOptionPane.showMessageDialog(component, msg);
		}
		/** '취소' 선택 시 업무 처리 */
		else {
			JOptionPane.showMessageDialog(component, "취소하였습니다.");
		}
	}

	/** 모듈 사용 시 기능목록을 사용자가 정의할 수 있도록 인터페이스 설계 */
	public interface ConfirmWindowWork {
		public String yesWork();

		public String noWork();
	}
}
