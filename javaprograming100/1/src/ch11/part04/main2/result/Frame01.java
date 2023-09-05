package ch11.part04.main2.result;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame01 extends JFrame  {

	private Frame02 frame02;
	public void setFrame02(Frame02 frame02){
		this.frame02 = frame02;
	}

	public Frame01(){
		/** 화면 기본 구성 */
		setTitle("Frame01");
		setLayout(null);
		setBounds(0,0, 300,300);

		/** 컴포넌트(텍스트) 생성 */
		final JTextField text = new JTextField();
		text.setBounds(10,10, 200, 30);
		this.add(text);

		/** 컴포넌트(버튼) 생성 */
		JButton btn = new JButton("현재시간");
		btn.setBounds(10,50, 150, 30);
		this.add(btn);

		/** 버튼클릭 이벤트 처리 */
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Calendar calendar = Calendar.getInstance();
				String msg = calendar.getTime().toString();
				text.setText(msg);
				frame02.setTextValue(msg);
			}
		});
	}
}