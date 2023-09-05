package ch11.part04.main5;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** 부모클래스 MyFrame으로 변경 */
public class Frame02 extends MainFrame  {

	/** 컴포넌트 객체생성 구간 */
	private JTextField text = new JTextField();

	public void setTextValue(String textValue){ text.setText(textValue);}

	/** 화면설정 */
	protected void initFrame(){
		/** 화면 기본 구성 */
		setTitle("Frame02");
		setLayout(null);
		setBounds(400,0, 300,300);
	}

	/** 컴포넌트 설정 */
	protected void initComponent(){
		/** 컴포넌트(텍스트) 생성 */
		text.setBounds(10,10, 200, 30);
		this.add(text);
	}

	/** 컴포넌트 이벤트 처리 */
	protected void initEvent(){
	}
}