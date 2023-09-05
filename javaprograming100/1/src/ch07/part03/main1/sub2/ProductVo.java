package ch07.part03.main1.sub2;

public class ProductVo {

	/** 전역변수 정의 */
	private String productNo;
	private String productName;
	private String price;

	/** 외부에서 직접 접근을 시키기 위해 static으로 사용 */
	public static class TableInfo {
		/** 모든 객체를 공통으로 사용되기 때문에 static으로 사용함 */
		public final static String[] HEADER_INFO = { "품목번호", "품목명", "단가" };
		public final static int[] WIDTH_INFO = { 100, 400, 100 };
	}
}