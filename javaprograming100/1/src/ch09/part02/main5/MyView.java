package ch09.part02.main5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyView extends JFrame {

	private JTextField textField = new JTextField();

	/** 객체생성 시 컴포넌트를 구성하기 위해 생성자함수에 구현 */
	public MyView() {

		setLayout(null);
		setSize(400, 200); // 메인화면 크기 – 너비 400 픽셀, 높이 200 픽셀

		/** 텍스트입력 컴포넌트 정의 및 위치, 크기설정 */
		// JTextField textField = new JTextField(); ☞ 전역변수로 이동
		textField.setLocation(10, 10);		// 위치설정
		textField.setSize(200, 30);			// 크기설정
		add(textField); 								// 화면에 컴포넌트 추가

		/** 버튼 컴포넌트 정의 및 위치, 크기설정 */
		JButton btn = new JButton("클릭");
		btn.setLocation(220, 10);			// 위치설정
		btn.setSize(100, 30);					// 크기설정
		add(btn); 										// 화면에 컴포넌트 추가

		/** 버튼클릭 이벤트함수 사용 */
		ActionListener action = new ActionEventImpl();
		btn.addActionListener(action);
	}

	public static void main(String[] args) {
		MyView myView = new MyView();
		myView.setVisible(true);
	}

	/** 버튼 이벤트를 구현하기 위한 ActionEvent 인터페이스 구현클래스 */
	public class ActionEventImpl implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			/** 텍스트 입력 컴포넌트에 'test'라는 문자열의 값을 입력 */
			textField.setText("test");
		}
	}
}