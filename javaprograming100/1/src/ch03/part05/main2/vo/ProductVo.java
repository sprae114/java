package ch03.part05.main2.vo;

import java.util.Arrays;

public class ProductVo {

	/** 전역변수 - 품목번호, 품목명, 단가 */
	public String productNo;
	public String productName;
	public int price;

	/** 외부에서 호출시 전역변수의 품목번호를 반환하기 위한 함수 */
	public String getProductNo() {
		return productNo;
	}

  	/** 외부에서 품목번호를 제공 시 전역변수의 품목번호에 값을 저장하기 위한 함수 */
	public void setProductNo(String productNo) {
		this.productNo = productNo;
		this.printResult(productNo);
	}

	/** 외부에서 호출 시 전역변수의 제품명을 반환하기 위한 함수 */
	public String getProductName() {
		return productName;
	}

  	/** 외부에서 제품명을 제공 시 전역변수의 제품명에 값을 저장하기 위한 함수 */
	public void setProductName(String productName) {
		this.productName = productName;
		this.printResult(productNo);
	}

	/** 외부에서 호출 시 전역변수의 단가를 반환하기 위한 함수 */
	public int getPrice() {
		return price;
	}

	/** 외부에서 단가를 제공 시 전역변수의 단가에 값을 저장하기 위한 함수 */
	public void setPrice(int price) {
		this.price = price;

		/** 오류발생 – printResult()는 String타입의 파라미터만 들어올 수 있음 */
		// printResult(productNo);

		/** String 연산에서 『문자+숫자 = 문자』가 된다. */
		String msg = "" + price;
		this.printResult(msg);
	}

	/** setXXX() 함수를 사용 시 아래의 메시지가 나타나도록 함수 구현 */
	public String printResult(String msg) {
		return msg + "가 입력되었습니다.";
	}

	/** 동적파라미터를 사용한 print() 함수를 사용 */
	public String print(String... message) {
    /** Arrays.toString() 함수는 앞으로 배울 배열에서 다룰 예정이다. */
		return Arrays.toString(message);
	}
}