package ch20.part02.main5;

import java.text.DecimalFormat;
import java.text.ParseException;

public class TestMain {

	public static void main(String[] args) throws ParseException {

		double number = 3.141592;

		/** "#.#" 패턴의 객체생성: 지정된 소숫점 이하 자릿수는 반올림 */
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println(df.format(number)); // 3.1

		/** "0000000.0000000" 패턴 변경: 값이 없을 경우 '0'으로 채움 */
		df.applyPattern("0000000.0000000");
		System.out.println(df.format(number)); // 0000003.1415920

		/** parse() 메소드로 문자열을 파싱하고 double형으로 변환한 값 선언
		 *  doubleValue()는 Number 객체의 메소드 */
		double number2 = df.parse("123456789.98765").doubleValue();

		/** "#,##0.00" 패턴 변경: '#'과 '0'을 조합하고 ',' 자릿수 표현 */
		df.applyPattern("#,##0.00");
		System.out.println(df.format(number2)); // 123,456,789.99

		/** "##E0" 패턴 변경: 지수표현 */
		df.applyPattern("0.##E0");
		System.out.println(df.format(number2)); // 1.23E8

		/** "#.#%" 패턴 변경: %(백분율) 표현  */
		df.applyPattern("#.#%");
		System.out.println(df.format(number2)); // 12345678998.8%

		/** "\u00A4#,###" 패턴 변경: 통화표시와 자릿수 표현  */
		df.applyPattern("\u00A4 #,###");
		System.out.println(df.format(number2)); // ￦ 123,456,790

		/** "'#'#,###.#" 패턴 변경:  escape 문자 표시 */
		df.applyPattern("'#'#,###.#");
		System.out.println(df.format(number2)); // #123,456,790
	}

}
