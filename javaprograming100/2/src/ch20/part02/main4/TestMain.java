package ch20.part02.main4;

import java.text.NumberFormat;
import java.util.Locale;

public class TestMain {
	public static void main(String[] args) {
		double number = 12345.6789;

		/** getInstance(): 기본 객체 생성 */
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(number)); 				//→ 【결과】 12,345.679

		/** getNumberInstance(): 기본 객체 생성 getInstance()와 결과 동일 */
		nf = NumberFormat.getNumberInstance();
		System.out.println(nf.format(number)); 				//→ 【결과】 12,345.679

		/** 정수 최대 자리수 지정 */
		nf.setMaximumIntegerDigits(2);
		System.out.println(nf.format(number)); 			//→ 【결과】 45.679

		/** 소수점 최소 자리수 지정 */
		nf.setMinimumFractionDigits(5);
		System.out.println(nf.format(number)); 			//→ 【결과】 45.67890

		/** getIntegerInstance(): 실수를 반올림한 정수 객체생성 */
		nf = NumberFormat.getIntegerInstance();
		System.out.println(nf.format(number)); 			//→ 【결과】 12,346

		/** getPercentInstance(): %(백분율) 객체생성 */
		nf = NumberFormat.getPercentInstance();

		/** 소수점 이하 최대 자리수 지정: 지정 자릿수 이하는 반올림 */
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(number)); 			//→ 【결과】 1,234,567.89%

		/** getCurrencyInstance(): 통화 객체생성(기본 로케일) */
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(number)); 			//→ 【결과】 ￦12,346

		/** JAPAN 화폐단위 로케일 지정 */
		nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(nf.format(number)); 			//→ 【결과】 ￥12,346

		/** US 화폐단위 로케일 지정 */
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(number)); 			//→ 【결과】 $12,345.68
	}
}
