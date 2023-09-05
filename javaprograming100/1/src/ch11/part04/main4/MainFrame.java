package ch11.part04.main4;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/** 생성자함수 정의 */
	public MainFrame(){ init(); }

	/** 외부에서도 사용할 수 있도록 『public』으로 설정함 */
	public final void init(){
		initFrame(); /** Frame 초기화 */
		initComponent(); /** 컴포넌트 설정 */
		initEvent(); /** 컴포넌트 이벤트 설정 */
	}

	/** 화면설정 */
	protected void initFrame(){ }

	/** 컴포넌트 설정 */
	protected void initComponent(){ }

	/** 컴포넌트 이벤트 처리 */
	protected void initEvent(){ }
}