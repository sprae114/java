package ch11.part04.main2;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame02 extends JFrame {
	public Frame02() {

		/** 화면 기본 구성 */
		setTitle("Frame02");
		setLayout(null);
		setBounds(400, 0, 300, 300);

		/** 컴포넌트(텍스트) 생성 */
		JTextField text = new JTextField();
		text.setBounds(10, 10, 200, 30);
		this.add(text);
	}
}