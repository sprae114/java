package ch11.part04.main4;

import ch11.part04.main3.Frame01;
import ch11.part04.main3.Frame02;

public class TestMain {
	public static void main(String[] args) {

		/** Frame01 객체생성 및 화면호출 */
		Frame01 frame01 = new Frame01();
		frame01.setVisible(true);

		/** Frame02 객체생성 및 화면호출 */
		Frame02 frame02 = new Frame02();
		frame02.setVisible(true);

		frame01.setFrame02(frame02);
	}
}
