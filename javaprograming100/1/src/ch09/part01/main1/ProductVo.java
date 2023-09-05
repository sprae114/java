package ch09.part01.main1;

public class ProductVo extends DefaultVo { /** 기본 Vo 클래스를 상속 */

    @Desc(name="품목번호")
    private String productNo;
    @Desc(name="품목명")
    private String productName;
    @Desc(name="단가")
    private int price;

    public String getProductNo() { return productNo; }
    public void setProductNo(String productNo) { this.productNo = productNo;	}
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}