package ch07.part07.main4.sub7;

public class ProductVo {

	private String productNo;
	private String productName;

	/** 통화별로 환율정보 기입 */
  	@Price( value=10.19, currencyName="엔", currency="JPY")
  	@Price( value=1142.50, currencyName="달러", currency="USD")
	private int price;

	/** 생성자 함수 정의 */
	public ProductVo(String productNo, String proudctName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

	/** getter setter 함수 정의 */
	public int getPrice() {	 return price; }
	public String getProductNo() { return productNo;	}
	public void setProductNo(String productNo) { this.productNo = productNo; }
	public String getProductName() {	return productName; }
	public void setProductName(String productName) {	this.productName = productName; }
	public void setPrice(int price) { 	this.price = price; }
}