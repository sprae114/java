package ch07.part03.main1.sub1;

import ch07.part03.main1.sub1.MyButton.PositionInfo;

/*
내부 클래스를 설명하는 코드
 */

public class TestMain {
	public static void main(String[] args) {

		MyButton btn = new MyButton();

		/** 버튼 제목설정 */
		btn.setCaption("저장");

		/** 버튼 위치설정 */
		PositionInfo positionInfo = btn.getPositionInfo();
		positionInfo.x = 100;
		positionInfo.y = 100;
		positionInfo.width = 200;
		positionInfo.height = 40;

		/** 버튼정보 조회 */
		System.out.println("버튼제목 = " + btn.getCaption());
		System.out.println("버튼위치정보 = " + positionInfo);

	}
}
