package ch07.part07.main4.sub6;

import java.lang.reflect.Field;

public class TestMain {
	public static void main(String[] args) {
		ProductVo p = new ProductVo("a001", "아메리카노", 4000);
		try {
			/** Class 객체 → Field 객체 */
			Field field = ProductVo.class.getDeclaredField("price");
			/** @Prices 객체 */
			Prices prices = field.getAnnotation(Prices.class);
			/** @Price 객체 */
			Price[] types = prices.value();

			for (Price price : types) {

				System.out.println("[어노테이션 정보] ::: " + price);
				double value = price.value();
				String nation = price.currency();
				String unitName = price.currencyName();
				double price2 = 1.0 * p.getPrice() / value;

				/** 소수 2째자리로 나타내기 위한 로직 */
				price2 = ((int)(price2*100+0.5))/100.0;
				System.out.println(nation + " : " + price2 + " " + unitName);
			}

			System.out.println("\r\n---------------------");
			Price[] abt = field.getAnnotationsByType(Price.class);
			for (Price price : abt) {
				System.out.println("[어노테이션 정보] ::: " + price);
				double value = price.value();
				String nation = price.currency();
				String unitName = price.currencyName();
				double price2 = 1.0 * p.getPrice() / value;

				/** 소수 2째자리로 나타내기 위한 로직 */
				price2 = ((int)(price2*100+0.5))/100.0;
				System.out.println(nation + " : " + price2 + " " + unitName);
			}


		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}