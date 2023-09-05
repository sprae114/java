package ch09.part02.main1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ch09.part02.main1.ConfirmUtil.ConfirmWindowWork;

public class TestView extends MainView {
	public TestView() {
		JButton btn = new JButton("저장");
		btn.setBounds(10, 10, 100, 30);

		ButtonAction action = new ButtonAction();
		btn.addActionListener(action);

		this.add(btn);
	}

	public class ButtonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			/** 모듈 사용 */
			ConfirmUtil.confirmWindow(TestView.this, new ConfirmWindowWork() {
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
		}
	}

	public static void main(String[] args) {
		TestView view = new TestView();
		view.setVisible(true);
	}
}