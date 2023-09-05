package ch07.part02.main5;

/** 객체를 생성할 때마다 생성된 객체의 순번대로 객체 번호가 저장되도록 로직을 구성 */
public class ProductVo {
	private static int count;
	private int no;
	{
		no = ++count;
	}
	public static void main(String[] args){

		ProductVo v1 = new ProductVo();
		ProductVo v2 = new ProductVo();
		ProductVo v3 = new ProductVo();
		ProductVo v4 = new ProductVo();
		ProductVo v5 = new ProductVo();

		System.out.println("객체1 : v1.no ["+v1.no+"]");
		System.out.println("객체2 : v2.no ["+v2.no+"]");
		System.out.println("객체3 : v3.no ["+v3.no+"]");
		System.out.println("객체4 : v4.no ["+v4.no+"]");
		System.out.println("객체5 : v5.no ["+v5.no+"]");

		System.out.println("객체1 : v1.count ["+v1.count+"]");
		System.out.println("객체2 : v2.count ["+v2.count+"]");
		System.out.println("객체3 : v3.count ["+v3.count+"]");
		System.out.println("객체4 : v4.count ["+v4.count+"]");
		System.out.println("객체5 : v5.count ["+v5.count+"]");

		System.out.println("ProductVo.count ["+ProductVo.count+"]");

	}
}