package ch09.part03.main1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ChildView extends AbstractMainView {

	/** 값을 입력하기 위한 텍스트 컴포넌트 */
	private JTextField textField1 = new JTextField("textField1");
	private JTextField textField2 = new JTextField("");

	/** 값의 항목명을 입력하기 위한 컴포넌트 */
	private JLabel label1 = new JLabel("화면오픈 시 활성화 및 초기화, 버튼클릭 시 비활성화");
	private JLabel label2 = new JLabel("이전 화면 값 유지");

	/** 버튼 컴포넌트 */
	private JButton btn1 = new JButton("버튼을 클릭 하시오.");

	{
		textField1.setBounds(10, 60, 200, 20);
		textField2.setBounds(10, 85, 200, 20);

		label1.setBounds(250, 60, 400, 20);
		label2.setBounds(250, 85, 400, 20);

		btn1.setBounds(10, 115, 200, 20);
	}

	@Override
	public String getTitle() {
		return "화면";
	}

	@Override
	public void setInitLayout() {
		this.setAlwaysOnTop(true);
		this.setExtendedState(JFrame.NORMAL);
		this.setLocation(500, 0);
		this.setSize(600, 300);
		this.add(btn1);
		this.add(label1);
		this.add(label2);
		this.add(textField1);
		this.add(textField2);
	}

	@Override
	public void setInitEvent() {
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				/** 데이터 생성 - 로직 생략 */
				String data = "버튼 클릭 시 비활성화";
				/** 화면 이벤트 종료 이후 컴포넌트에 자료 넣기 */
				textField1.setText(data);
				/** 화면 종료 후 컴포넌트 활성화/비활성화 처리 */
				textField1.setEnabled(false);
			}
		});
	}

	@Override
	public void setOpenView() {

		textField1.setText("");
		textField1.setEnabled(true);
	}
}