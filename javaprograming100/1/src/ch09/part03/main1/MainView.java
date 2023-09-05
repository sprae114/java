package ch09.part03.main1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainView extends AbstractMainView {

	private JButton btn = new JButton("버튼");

	/** View 호출을 위한 객체생성 */
	private ChildView childView = new ChildView();

	{
		System.out.println("MainView 초기화 구간 실행");
		btn.setBounds(10, 50, 100, 40);
	}

	@Override
	public String getTitle() {
		return "메인화면";
	}

	@Override
	public void setInitLayout() {
		System.out.println("MainView initLayout() 실행");
		this.add(btn);
	}

	@Override
	public void setInitEvent() {
		System.out.println("MainView initEvent() 실행");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				childView.setVisible(true);
			}
		});
	}

	@Override
	public void setOpenView() {
		System.out.println("MainView openView() 실행");
	}
}