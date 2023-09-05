package ch07.part07.main4.sub6;

public class ProductVo {

	private String productNo;
	private String productName;

	/** 국가에 따라서 환율이 다를 경우 반복해서 기입 */
	@Prices({
         @Price( value=10.19, currencyName="엔", currency="JPY")
       , @Price( value=1142.50, currencyName="달러", currency="USD")
    })
    private int price;

	public ProductVo(String productNo, String proudctName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}