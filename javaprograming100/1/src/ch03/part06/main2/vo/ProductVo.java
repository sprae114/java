package ch03.part06.main2.vo;



public class ProductVo {
    public String productNo;
    protected String productName;
    private int price;

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductInfo(String productNo, String productName){
        this.productNo = productNo;
        this.productName = productName;
    }

    public void setProductInfo(String productNo, String productName, int price){
        this.productNo = productNo;
        this.productName = productName;
        this.price = price;
    }
}
