package ch07.part06.main2.sub2;

public class ProductVo {

	private String productName;
	private int price;

	public ProductVo(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return productName + " : " + price;
	}
}