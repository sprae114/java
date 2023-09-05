package ch11.part02.main8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/** 화면 생성을 위해 JFrame 상속 */
public class Frame02 extends JFrame {

	/** 【절차2-3】 전역변수 textField 정의 후 지역변수 textField와 연결 */
	private JTextField textField ;

	public Frame02(){

    /** 화면 설정 */
		this.setTitle("화면B"); // 화면명을 수정
		this.setLayout(null); // 배치를 수동(위치와 크기)으로 입력
		this.setSize(300, 200); // 화면 생성위치, 크기 설정
		this.setLocation(450, 0); // 화면 생성위치

		/** 텍스트 생성 및 설정 */
		JTextField textField = new JTextField(); // 객체생성

		/** 【절차2-4】 전역변수 textField 정의 후 지역변수 textField와 연결 */
		this.textField = textField;

		textField.setBounds(10, 10, 100, 30); //
		this.add(textField);
	}

	/** 【절차2-5】 파라미터의 값을 전역변수 textField에 입력 */
 	public void setTextField(String text){
		textField.setText(text);
	}
}