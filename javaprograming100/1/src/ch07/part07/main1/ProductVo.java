package ch07.part07.main1;

public class ProductVo extends DefaultVo {

	/** 정의된 @Grid 어노테이션을 사용 */
	@Grid(name = "품목번호")
	private String productNo;
	@Grid(name = "품목명")
	private String productName;
	@Grid(name = "단가")
	private int price;

	public ProductVo(String productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}
}