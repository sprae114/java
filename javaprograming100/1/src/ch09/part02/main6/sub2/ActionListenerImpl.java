package ch09.part02.main6.sub2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** ActionListener 구현 클래스 정의 */
public class ActionListenerImpl implements ActionListener {

	/** MyView 타입 myView 전역변수 정의 */
	private MyView myView;

	/** 생성자함수 정의 */
	public ActionListenerImpl(MyView myView) {
		/** MyView 객체를 파라미터로 사용하여 데이터연결 */
		this.myView = myView;
	}

	/** 추상메소드 재정의(Override) */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		/** 버튼클릭 이벤트 로직처리 구간 */
		/** myView.setText() → textField ‘test' 문자입력 */
		myView.setText("test");
	}
}
