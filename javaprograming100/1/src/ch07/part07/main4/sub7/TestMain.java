package ch07.part07.main4.sub7;

import java.lang.reflect.Field;

public class TestMain {
	public static void main(String[] args) {
		ProductVo p = new ProductVo("a001", "아메리카노", 4000);
		try {
			/** ProductVo 클래스 → Class 객체 → Field 객체 */
			Field field = ProductVo.class.getDeclaredField("price");
			/** @Price 객체로 직접 조회 */
			Price[] prices = field.getAnnotationsByType(Price.class);
			for (Price price : prices) {

				/** @Price 가격정보 조회 - 환율, 통화, 통화명 */
				System.out.println("[어노테이션 정보] ::: " + price);
				double value = price.value();
				String nation = price.currency();
				String unitName = price.currencyName();

				/** 해당 통화의 값으로 변환 */
				double price2 = 1.0 * p.getPrice() / value;

				/** 소수 2째자리로 반올림하여 나타내기 위한 로직작성 */
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