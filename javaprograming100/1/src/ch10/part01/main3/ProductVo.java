package ch10.part01.main3;

public class ProductVo {

	/** productNo, productName, price 전역변수 정의 */
	private String productNo;
	private String productName;
	private int price;

	/** getter setter 함수 정의 */
	public String getProductNo(){return productNo;}
	public void setProductNo(String productNo){this.productNo = productNo;}
	public String getProductName(){return productName;}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public int getPrice(){return price;}
	public void setPrice(int price){this.price = price;}

	/** toString() 함수 재정의(Override) */
	@Override
	public String toString() {
		return "ProductVo [productNo=" + productNo + ", productName="
				+ productName + ", price=" + price + "]";
	}
}