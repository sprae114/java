package ch12.part04.main6;

public class TestMain {
	public static void main(String[] args) {

		/** 객체생성 */
		Frame01 frame01 = new Frame01();
		Frame02 frame02 = new Frame02();

		/** 공유데이터 저장 */
		DataContainer.addBean("frame01", frame01);
		DataContainer.addBean("frame02", frame02);

		/** 화면 view */
		frame01.setVisible(true);
		frame02.setVisible(true);
	}
}