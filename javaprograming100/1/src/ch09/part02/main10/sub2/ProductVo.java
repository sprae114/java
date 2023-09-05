package ch09.part02.main10.sub2;

public class ProductVo {

	/** productNo, productName, price 전역변수 정의 */
	private String productNo;
	private String productName;
	private int price;

	/** 생성자함수 정의 */
	public ProductVo(String productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

	/** getter setter 함수 정의 */
	public String getProductNo() { return productNo; }

	public void setProductNo(String productNo) {	this.productNo = productNo; }
	public String getProductName() {	return productName;	}
	public void setProductName(String productName) { this.productName = productName;	}
	public int getPrice() {		return price;	}
	public void setPrice(int price) {	this.price = price; }

	/** toString() 함수 정의  */
	@Override
	public String toString() {
		return productNo + ":" + productName + ":" + price;
	}
}