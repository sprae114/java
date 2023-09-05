package ch12.part04.main6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame02 extends JFrame  {

	/** JTextField 객체 text를 Frame02에 사용하도록 전역변수화 처리 */
	private JTextField text = new JTextField();
	public void setText(String msg){ text.setText(msg); }

	public Frame02(){

		/** 화면 기본 구성 */
		setTitle("Frame01");
		setLayout(null);
		setBounds(320,0, 300,300);

		/** 컴포넌트(텍스트) 생성 */
		//JTextField text = new JTextField();  // 【절차6】 전역변수로 변경
		text.setBounds(10,10, 200, 30);
		this.add(text);

		/** 컴포넌트(버튼) 생성 */
		JButton btn = new JButton("현재번호");
		btn.setBounds(10,50, 150, 30);
		this.add(btn);

		/** 버튼 이벤트 생성 */
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				/** 【절차6】 공유데이터에서 frame01 객체 가져오기 */
				Frame01 bean = DataContainer.getBean("frame01", Frame01.class);
				String text2 = bean.getText();
				if(text2==null || text2.equals("")){
					bean.setText("1");
				}else{
					int parseInt = Integer.parseInt(text2)+1;
					bean.setText(String.valueOf(parseInt));
				}
			}
		});
	}
}