package ch09.part02.main1;

import javax.swing.JFrame;

public class MainView extends JFrame {

	/** MainView 클래스를 상속받은 클래스는 아래의 로직을 공통으로 적용함 */
	public MainView() {

		/**
		 * 기본 배치 설정을 직접 수동으로 설정하도록 함 - 컴포넌트 수동 설정 시 Size와 Location을 설정해야 함
		 */
		setLayout(null);
		/** MainView의 기본사이즈를 가로 300px, 세로 200px로 설정 */
		setSize(300, 200);

	}
}