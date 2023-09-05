package ch11.part04.main4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** 부모클래스 MyFrame으로 변경 */
public class Frame01 extends MainFrame  {

	/** 컴포넌트 객체생성 구간 */
	private JTextField text = new JTextField(); // 익명클래스 접근
	private JButton btn = new JButton("현재시간");

	/** 자료연결을 위해 전역변수 및 함수 생성 */
	private Frame02 frame02;
	public void setFrame02(Frame02 frame02){ this.frame02 = frame02; }

	/** 화면설정 */
	protected void initFrame(){
		/** 화면 기본 구성 */
		setTitle("Frame01");
		setLayout(null);
		setBounds(0,0, 300,300);
	}

	/** 컴포넌트 설정 */
	protected void initComponent(){
		/** 컴포넌트(텍스트) 생성 */
		text.setBounds(10,10, 200, 30);
		this.add(text);
		/** 컴포넌트(버튼) 생성 */
		btn.setBounds(10,50, 150, 30);
		this.add(btn);
	}

	/** 컴포넌트 이벤트 처리 */
	protected void initEvent(){
		/** 버튼 이벤트 생성 */
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				/** 버튼 클릭 시 이벤트 로직 구성 */
				Calendar calendar = Calendar.getInstance();
				String msg = calendar.getTime().toString();

				/** 로직 구성 */
				text.setText(msg);
				frame02.setTextValue(msg);
			}
		});
	}
}