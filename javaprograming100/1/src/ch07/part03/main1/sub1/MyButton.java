package ch07.part03.main1.sub1;

public class MyButton {

	/** 버튼의 캡션정보 */
	private String caption;
	public void setCaption(String caption) { this.caption = caption; }
	public String getCaption() { return caption; }

	/** 버튼의 위치정보 */
	private PositionInfo positionInfo = new PositionInfo();
	public PositionInfo getPositionInfo() {	return positionInfo; }

	/** 버튼 위치정보타입 정의 */
	public class PositionInfo {

		/** 버튼 위치속성 정의 */
		public int x;
		public int y;
		public int width;
		public int height;

		/** 버튼정보 toString() 재정의 */
		@Override
		public String toString() {
			String msg = "PositionInfo [";
			msg += "x=" + x + ", y=" + y ;
			msg += ", width=" + width + ", height=" + height + "]";
			return msg;
		}
	}
}