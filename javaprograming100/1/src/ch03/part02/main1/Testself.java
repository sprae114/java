package ch03.part02.main1;

public class Testself {
    public static class Product{
        public String name;
        public int price;
    }

    public static void main(String[] args) {
        String mouse = "intoe";

        Product product = new Product();
        product.name = "커피";
        product.price = 3800;

        System.out.println(product);
    }
}
